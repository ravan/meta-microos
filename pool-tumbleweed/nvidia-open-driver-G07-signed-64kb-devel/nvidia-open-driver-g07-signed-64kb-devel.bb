SUMMARY = "Devel Package to nvidia-open-driver-G07-signed"
DESCRIPTION = "Provide build requiresments to build against nvidia-open-driver-G07-signed"
LICENSE = "GPL-2.0-only & MIT"

PV = "595.99.02"

RPM_NAME = "nvidia-open-driver-G07-signed-64kb-devel-595.99.02-2.2.aarch64.rpm"
RPM_HASH = "a48aac67f299a65b6d6e661345d381ce6d5e9341188daeafc42776514d77dc6b4dd6e17f172932fc6b972b4f099d0acfd21db32a3e1f6bcb3ff983be53589c84"

RPROVIDES:${PN} += "nvidia-open-driver-G07-signed-64kb-devel \
nvidia-open-driver-G07-signed-64kb-devel-gfx"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
