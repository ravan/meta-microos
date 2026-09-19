SUMMARY = "openSUSE NVIDIA repository definitions"
DESCRIPTION = "Definitions for NVIDIA repository management via zypp-services"
LICENSE = "MIT"

PV = "20260423.1a6a0f3"

RPM_NAME = "openSUSE-repos-Leap-NVIDIA-20260423.1a6a0f3-2.2.aarch64.rpm"
RPM_HASH = "d81461e73117936d15a833d3c4cae45bbc82d6cff70f9f5e4b8da4493931ef53e426338fe67f15b8c788b941e77dc330ff0d6a12176fb3384f767e3b2d44035f"

RPROVIDES:${PN} += "openSUSE-repos-Leap-NVIDIA \
openSUSE-repos-NVIDIA"

RDEPENDS:${PN} += "/usr/bin/sh \
openSUSE-repos-Leap"

inherit rpm
