SUMMARY = "Ditroff Output Displayer for Groff"
DESCRIPTION = "This version of xditview is called gxditview and has some extensions \
used by the groff command.  gxditview is used by groff if called with \
the -X option."
LICENSE = "GPL-3.0-or-later"

PV = "1.23.0"

RPM_NAME = "gxditview-1.23.0-6.5.aarch64.rpm"
RPM_HASH = "783f923e6a7e3e8b14fab448e0c152a6b7a190130d99a6c0a051c0f34ef41bc78996015c4161733985976915cf68e2690ec6d5bbd8316077ba76754563898bfd"

RPROVIDES:${PN} += "gxditview \
gxdview"

RDEPENDS:${PN} += "groff-full \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
