SUMMARY = "Python SDK for CubeSandbox"
DESCRIPTION = "Python SDK for CubeSandbox, a lightweight microVM sandbox service for AI \
agents built on RustVMM and KVM. The SDK talks to a CubeSandbox control-plane \
API to create and manage hardware-isolated sandboxes, run commands and stream \
their output, manage the sandbox filesystem, build and manage templates, and \
apply per-sandbox network policies."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "python314-cubesandbox-0.7.0-1.1.noarch.rpm"
RPM_HASH = "cab2857882e9d166614b7aeb05298df497ffdef2c867ed2ca04072bcd3356796fcae094b1fb2f91179c7bcffa58ee05ca0ba46c2e715c70a56ab4f687f2ffebe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cubesandbox \
python314-cubesandbox \
python3dist-cubesandbox"

RDEPENDS:${PN} += "python-abi \
python314-httpx \
python314-requests"

inherit rpm
