SUMMARY = "Differentiable computer vision library for PyTorch"
DESCRIPTION = "Kornia is a differentiable computer vision library built on PyTorch. \
It provides image processing operators, geometric transforms, feature \
detection, and augmentations that integrate with autograd and GPU \
acceleration."
LICENSE = "Apache-2.0"

PV = "0.8.3"

RPM_NAME = "python314-kornia-0.8.3-1.1.noarch.rpm"
RPM_HASH = "f9897363ca7c3d041b91998d6b70c04461ee2fd6d0ea0dfe1df28509c542bd7c1b152547a901da6feef830d6433c81e0e5f12e0c586817a8d6eca50cf0e949ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-kornia \
python314-kornia \
python3dist-kornia"

RDEPENDS:${PN} += "python-abi \
python314-kornia-rs \
python314-packaging \
python314-torch"

inherit rpm
