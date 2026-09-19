SUMMARY = "openSUSE NVIDIA repository definitions"
DESCRIPTION = "Definitions for NVIDIA repository management via zypp-services"
LICENSE = "MIT"

PV = "20260423.1a6a0f3"

RPM_NAME = "openSUSE-repos-Tumbleweed-NVIDIA-20260423.1a6a0f3-2.2.aarch64.rpm"
RPM_HASH = "7c541c72c3a2e467e2f98faac2c0bee71d80c92c6d7d1edb072d6965391423441e60c3d571c15d0728beef2dc2e6d753600de7e28a18e29b4527e89d66c9d2ca"

RPROVIDES:${PN} += "openSUSE-repos-NVIDIA \
openSUSE-repos-Tumbleweed-NVIDIA"

RDEPENDS:${PN} += "/usr/bin/sh \
openSUSE-repos-Tumbleweed"

inherit rpm
