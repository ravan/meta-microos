SUMMARY = "Smart card tools"
DESCRIPTION = "These tools are used to test a PC/SC driver, card or reader \
or send commands in a friendly environment \
(text or graphical user interface)."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.5"

RPM_NAME = "pcsc-tools-1.7.5-1.3.aarch64.rpm"
RPM_HASH = "2ceb7b302cb49351f85bc16792fcf704349d7672b7b855b8c6926fdbacca4c380b556937640e81b950088e3db5013b5fda36d5d36de1347725705e2da14cff7a"

RPROVIDES:${PN} += "pcsc-tools"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcsclite.so.1 \
perl-Glib \
perl-Gtk3 \
perl-pcsc"

inherit rpm
