SUMMARY = "Displays where a particular program in your path is located"
DESCRIPTION = "The which command shows the full pathname of a specified program, if the \
specified program is in your PATH."
LICENSE = "GPL-3.0-or-later"

PV = "2.25"

RPM_NAME = "which-2.25-1.3.aarch64.rpm"
RPM_HASH = "93d2decbd6c2db30343149c45e61e3d52678b79fdcd22309dc0daec9fdac278d5093967e60869412a0d31c758baf2d25326980d3a57ec98a6d1757b3565a0a96"

RPROVIDES:${PN} += "util-linux-/usr/bin/which \
which"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
