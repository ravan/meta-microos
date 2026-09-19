SUMMARY = "Load and run pre-trained PyTorch image models"
DESCRIPTION = "Spandrel loads pre-trained PyTorch image models from .pth / safetensors \
files, auto-detects the architecture and hyperparameters, and exposes a \
unified inference interface. Used by ComfyUI for architecture support."
LICENSE = "MIT"

PV = "0.4.2"

RPM_NAME = "python313-spandrel-0.4.2-1.1.noarch.rpm"
RPM_HASH = "ecb28ea3c8a8bae51a9a67bfe7ca137b3e8b6ea34ef708028868660f8f07ecd0d1c9f526afa0ec684b751d473aca786db875050086b18a7d73470010b343c4f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-spandrel \
python3.13dist-spandrel \
python313-spandrel \
python3dist-spandrel"

RDEPENDS:${PN} += "python-abi \
python313-einops \
python313-numpy \
python313-safetensors \
python313-torch \
python313-torchvision \
python313-typing-extensions"

inherit rpm
