document.addEventListener("DOMContentLoaded", () => {
  const formCard = document.querySelector(".form-card");
  formCard.style.opacity = "0";
  formCard.style.transform = "translateY(20px)";
  formCard.style.transition = "opacity 1s ease, transform 1s ease";

  setTimeout(() => {
    formCard.style.opacity = "1";
    formCard.style.transform = "translateY(0)";
  }, 150);
});

const overlay = document.querySelector(".overlay");
if (overlay) {
  document.addEventListener("mousemove", (e) => {
    const moveX = (e.clientX / window.innerWidth - 0.5) * 30;
    const moveY = (e.clientY / window.innerHeight - 0.5) * 30;
    overlay.style.backgroundPosition = `${50 + moveX}% ${50 + moveY}%`;
  });
}
