SUMMARY = "Python SDK for CubeSandbox"
DESCRIPTION = "Python SDK for CubeSandbox, a lightweight microVM sandbox service for AI \
agents built on RustVMM and KVM. The SDK talks to a CubeSandbox control-plane \
API to create and manage hardware-isolated sandboxes, run commands and stream \
their output, manage the sandbox filesystem, build and manage templates, and \
apply per-sandbox network policies."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "python313-cubesandbox-0.7.0-1.1.noarch.rpm"
RPM_HASH = "c017a5fa5ae151e712944dee6f85da72328a0b4c2cc5d8fc46cbe4821e68921185c9571bbe3831fff423dcc0ba40505e0fcd0bd9a999d4ebd56202d39ad1293e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cubesandbox \
python3.13dist-cubesandbox \
python313-cubesandbox \
python3dist-cubesandbox"

RDEPENDS:${PN} += "python-abi \
python313-httpx \
python313-requests"

inherit rpm
