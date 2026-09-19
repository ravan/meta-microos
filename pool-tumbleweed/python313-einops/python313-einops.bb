SUMMARY = "A new flavour of deep learning operations"
DESCRIPTION = "Flexible and powerful tensor operations for readable and reliable code. \
Supports numpy, pytorch, tensorflow, jax, and others."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python313-einops-0.8.2-1.1.noarch.rpm"
RPM_HASH = "e821b5a18c92866688b603e2377f932f65d7c5a5f128b2a0fdfd4f478113f3ffa1060423944a9d58c0197daf2c45dad8c8c1ed540f5f0223e6f1ce800979c74a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-einops \
python3.13dist-einops \
python313-einops \
python3dist-einops"

RDEPENDS:${PN} += "python-abi"

inherit rpm
