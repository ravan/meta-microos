SUMMARY = "Devel Package to nvidia-open-driver-G06-signed-cuda"
DESCRIPTION = "Provide build requiresments to build against nvidia-open-driver-G06-signed-cuda"
LICENSE = "GPL-2.0-only & MIT"

PV = "580.178.04"

RPM_NAME = "nvidia-open-driver-G06-signed-cuda-64kb-devel-580.178.04-1.5.aarch64.rpm"
RPM_HASH = "a6fbd4fe1ef9a43c73f7efadf69640dd359669c702a1bfea7e9ef8509deaf39318d15b38be661211c53a19f57594c2781067e446b6fcd7e46686c9ef359ff4d8"

RPROVIDES:${PN} += "nvidia-open-driver-G06-signed-64kb-devel-cuda \
nvidia-open-driver-G06-signed-cuda-64kb-devel"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
