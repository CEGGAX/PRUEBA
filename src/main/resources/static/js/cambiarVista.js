
  document.getElementById("btnComentarios").addEventListener("click", () => {
    document.getElementById("seccionComentarios").classList.remove("hidden");
    document.getElementById("seccionUsuarios").classList.add("hidden");
  });

  document.getElementById("btnUsuarios").addEventListener("click", () => {
    document.getElementById("seccionUsuarios").classList.remove("hidden");
    document.getElementById("seccionComentarios").classList.add("hidden");
  });

