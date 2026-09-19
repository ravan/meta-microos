SUMMARY = "Devel Package to nvidia-open-driver-G07-signed-cuda"
DESCRIPTION = "Provide build requiresments to build against nvidia-open-driver-G07-signed-cuda"
LICENSE = "GPL-2.0-only & MIT"

PV = "615.71.09"

RPM_NAME = "nvidia-open-driver-G07-signed-cuda-default-devel-615.71.09-2.2.aarch64.rpm"
RPM_HASH = "ae0265724608b83dbb1acc40649b9fc2bfe33b3c48497091178e135bd602875cfde715ca034735e303b20ad10a1b74987db8eb65e6f5afc3b5a5709ee45b749a"

RPROVIDES:${PN} += "nvidia-open-driver-G07-signed-cuda-default-devel \
nvidia-open-driver-G07-signed-default-devel-cuda"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
