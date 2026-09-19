SUMMARY = "Differentiable computer vision library for PyTorch"
DESCRIPTION = "Kornia is a differentiable computer vision library built on PyTorch. \
It provides image processing operators, geometric transforms, feature \
detection, and augmentations that integrate with autograd and GPU \
acceleration."
LICENSE = "Apache-2.0"

PV = "0.8.3"

RPM_NAME = "python313-kornia-0.8.3-1.1.noarch.rpm"
RPM_HASH = "c5bdb4c7e963d2463bba7ed2fd3f40081e4a9785977fb9e0fc0700f9e53402488fe895ebfaba69c1f9e92149b230d0126065c0d4894eaa7e68de44c7bffec13b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kornia \
python3.13dist-kornia \
python313-kornia \
python3dist-kornia"

RDEPENDS:${PN} += "python-abi \
python313-kornia-rs \
python313-packaging \
python313-torch"

inherit rpm
