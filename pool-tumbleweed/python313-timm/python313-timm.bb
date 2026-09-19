SUMMARY = "PyTorch Image Models"
DESCRIPTION = "PyTorch Image Models (timm) is a collection of image models, layers, utilities, \
optimizers, schedulers, data-loaders / augmentations, and reference training / \
validation scripts that aim to pull together a wide variety of SOTA models with \
ability to reproduce ImageNet training results."
LICENSE = "Apache-2.0"

PV = "1.0.29"

RPM_NAME = "python313-timm-1.0.29-1.1.noarch.rpm"
RPM_HASH = "d4f3883d2d86627554c16b64cb7bb3697237d7e6cda9e5de3d5efa65740ce39f58635e2c61fb1d2a6f109049f4532c26428e7463c42d055134a40f383c972cd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-timm \
python3.13dist-timm \
python313-timm \
python3dist-timm"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML \
python313-huggingface-hub \
python313-safetensors \
python313-torch \
python313-torchvision"

inherit rpm
