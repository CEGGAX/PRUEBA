document.addEventListener("DOMContentLoaded", () => {
  fetch("/sendcomments")
    .then(response => response.json())
    .then(data => {
      const tbody = document.querySelector("#tablaComentarios tbody");
      tbody.innerHTML = ""; // Limpia antes de insertar

      data.forEach(c => {
        const fila = `
          <tr>
            <td>${c.nombre}</td>
            <td>${c.email}</td>
            <td>${c.asunto}</td>
            <td>${c.comentario}</td>
          </tr>
        `;
        tbody.innerHTML += fila;
      });
    })
    .catch(error => console.error("Error al cargar los comentarios:", error));
});