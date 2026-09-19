SUMMARY = "Load and run pre-trained PyTorch image models"
DESCRIPTION = "Spandrel loads pre-trained PyTorch image models from .pth / safetensors \
files, auto-detects the architecture and hyperparameters, and exposes a \
unified inference interface. Used by ComfyUI for architecture support."
LICENSE = "MIT"

PV = "0.4.2"

RPM_NAME = "python314-spandrel-0.4.2-1.1.noarch.rpm"
RPM_HASH = "8bf656dc0443c0ac8b0d943497a0ffcd8279f28688d373d5cb4e009f63efa4d8c376b4959d7c1164d5eacdc4bf89b9deb979c78b306effd053223ddfa7bdd455"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-spandrel \
python314-spandrel \
python3dist-spandrel"

RDEPENDS:${PN} += "python-abi \
python314-einops \
python314-numpy \
python314-safetensors \
python314-torch \
python314-torchvision \
python314-typing-extensions"

inherit rpm
