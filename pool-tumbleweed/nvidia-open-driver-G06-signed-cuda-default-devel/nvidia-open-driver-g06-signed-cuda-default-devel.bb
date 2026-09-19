SUMMARY = "Devel Package to nvidia-open-driver-G06-signed-cuda"
DESCRIPTION = "Provide build requiresments to build against nvidia-open-driver-G06-signed-cuda"
LICENSE = "GPL-2.0-only & MIT"

PV = "580.178.04"

RPM_NAME = "nvidia-open-driver-G06-signed-cuda-default-devel-580.178.04-1.5.aarch64.rpm"
RPM_HASH = "cb246863ef470cd25873b4ca561fc157a5324f5f41fae8b1450d4ecb3c5d4591013834d91f67307efab4e8f3026409f3012b23744030f803387c1a52af1f12d3"

RPROVIDES:${PN} += "nvidia-open-driver-G06-signed-cuda-default-devel \
nvidia-open-driver-G06-signed-default-devel-cuda"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
