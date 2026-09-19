SUMMARY = "Devel Package to nvidia-open-driver-G06-signed-cuda"
DESCRIPTION = "Provide build requiresments to build against nvidia-open-driver-G06-signed-cuda"
LICENSE = "GPL-2.0-only & MIT"

PV = "580.178.04"

RPM_NAME = "nvidia-open-driver-G06-signed-cuda-longterm-devel-580.178.04-1.5.aarch64.rpm"
RPM_HASH = "b6c9aa256b173d2352c82f46ac18dcd4d4a01cc76b636711f12e26604f57af59c75b820df1d1b021944a6da76712067bc555e26c61fdd4000658dadd36c97988"

RPROVIDES:${PN} += "nvidia-open-driver-G06-signed-cuda-longterm-devel \
nvidia-open-driver-G06-signed-longterm-devel-cuda"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
