SUMMARY = "Mono.WebServer.FPM Helper"
DESCRIPTION = "Library of Mono.WebServer.FPM Helper."
LICENSE = "MIT"

PV = "4.7.1"

RPM_NAME = "libfpm_helper0-4.7.1-2.11.aarch64.rpm"
RPM_HASH = "41590b9cad65113164efae83b5f404bd20de4faf37ac17e4c3d166e8b104e47f278f0817e9808b1191fdfadea551b8fd1b4d5461b34c1c461cc8f4f46967f6df"

RPROVIDES:${PN} += "libfpm-helper.so.0 \
libfpm-helper0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
