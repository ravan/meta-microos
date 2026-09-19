SUMMARY = "PyTorch Image Models"
DESCRIPTION = "PyTorch Image Models (timm) is a collection of image models, layers, utilities, \
optimizers, schedulers, data-loaders / augmentations, and reference training / \
validation scripts that aim to pull together a wide variety of SOTA models with \
ability to reproduce ImageNet training results."
LICENSE = "Apache-2.0"

PV = "1.0.29"

RPM_NAME = "python314-timm-1.0.29-1.1.noarch.rpm"
RPM_HASH = "c7c840374736427dc8be00c8621bf077156510375afac841fb3c3754050c10060d413ba7117dc2a7b70fdb067d86cfcb4449442d76c7df8c70d1255cbcfd6cf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-timm \
python314-timm \
python3dist-timm"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML \
python314-huggingface-hub \
python314-safetensors \
python314-torch \
python314-torchvision"

inherit rpm
