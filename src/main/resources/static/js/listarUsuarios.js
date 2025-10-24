document.addEventListener("DOMContentLoaded", () => {
  fetch("/Usuarios")
    .then(response => response.json())
    .then(data => {
      const tbody = document.querySelector("#tablaUsuarios tbody");
      tbody.innerHTML = ""; // Limpia antes de insertar

      data.forEach(c => {
        const fila = `
          <tr>
            <td>${c.idU}</td>
            <td>${c.nombreU}</td>
            <td>${c.emailU}</td>
            <td>${c.rolU}</td>
          </tr>
        `;
        tbody.innerHTML += fila;
      });
    })
    .catch(error => console.error("Error al cargar los usuarios:", error));
});