SUMMARY = "Devel Package to nvidia-open-driver-G07-signed-cuda"
DESCRIPTION = "Provide build requiresments to build against nvidia-open-driver-G07-signed-cuda"
LICENSE = "GPL-2.0-only & MIT"

PV = "615.71.09"

RPM_NAME = "nvidia-open-driver-G07-signed-cuda-longterm-devel-615.71.09-2.2.aarch64.rpm"
RPM_HASH = "1504876df7b8d196ec9e0cc39421de1136b0f280e36359361e0dc4a2370b1fe29ec16bd752877e8b2ad89e21ce0066e223123e4a22023dcb96c9b4a933270627"

RPROVIDES:${PN} += "nvidia-open-driver-G07-signed-cuda-longterm-devel \
nvidia-open-driver-G07-signed-longterm-devel-cuda"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
