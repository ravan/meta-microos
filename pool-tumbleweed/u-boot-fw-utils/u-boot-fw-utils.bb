SUMMARY = "Replacement for fw_printenv/setenv utilities provided by U-Boot"
DESCRIPTION = "Hardware-independent replacement for fw_printenv/setenv utilities \
provided by U-Boot."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.7"

RPM_NAME = "u-boot-fw-utils-0.3.7-1.3.aarch64.rpm"
RPM_HASH = "411bf735bf8d6ee76ab61cc4cf54f97435f17814d49249f6d5b9889c1e69a1a5d5505ad0043546339466ca9fafadef2501fd395b334d3c250bed268df805631e"

RPROVIDES:${PN} += "u-boot-fw-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libubootenv.so.0"

inherit rpm
