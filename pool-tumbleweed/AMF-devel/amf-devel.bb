SUMMARY = "Development files for AMF"
DESCRIPTION = "A lightweight, portable multimedia framework that abstracts away most of the \
platform and API-specific details. AMF is supported on the closed-source \
AMDGPU-Pro driver. \
 \
The AMF-devel package contains header files for developing \
applications that use AMF."
LICENSE = "MIT"

PV = "1.5.2"

RPM_NAME = "AMF-devel-1.5.2-1.2.noarch.rpm"
RPM_HASH = "61a7bb6c7546224a853acb6db15eae75f6b0d5b2cbf322de6a65288bec38fb263d9939d38a9c07f277010913885c38bfdd4da176e20dee35640db4ec93d6e972"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "AMF-devel"

RDEPENDS:${PN} += ""

inherit rpm
