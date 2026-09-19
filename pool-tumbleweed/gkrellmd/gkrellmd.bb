SUMMARY = "Multiple Stacked Monitors daemon"
DESCRIPTION = "The GNU Grell Monitors daemon service, independent from any GUI library."
LICENSE = "GPL-3.0-or-later"

PV = "2.5.1"

RPM_NAME = "gkrellmd-2.5.1-1.3.aarch64.rpm"
RPM_HASH = "8b4a4720b80f79a95538bd094ae508d53977dbde8992d8e97f74f9228d8e4784c33d332afd15db2522040aac110df119c39b689c1a673ac928a1a2512758afb0"

RPROVIDES:${PN} += "config-gkrellmd \
gkrellmd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libsensors.so.4 \
libsystemd.so.0"

inherit rpm
