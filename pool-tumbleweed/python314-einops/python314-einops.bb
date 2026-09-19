SUMMARY = "A new flavour of deep learning operations"
DESCRIPTION = "Flexible and powerful tensor operations for readable and reliable code. \
Supports numpy, pytorch, tensorflow, jax, and others."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python314-einops-0.8.2-1.1.noarch.rpm"
RPM_HASH = "faef9a71b0e5fa0ac1771f798999f1a1a00f7cd9a3de8ba24d4e68b252ab21aa7c5166d0088c1e94352bdc16bdaabf3553905215be4fe8bc7946e15fc6f7abea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-einops \
python314-einops \
python3dist-einops"

RDEPENDS:${PN} += "python-abi"

inherit rpm
