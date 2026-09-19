SUMMARY = "The Moon in focus"
DESCRIPTION = "One of the most important programs existing :-) Using this program, you \
can display all important information about the moon constantly. At \
last... \
 \
Hint: The option -c makes it also work with color ;-)"
LICENSE = "SUSE-Public-Domain"

PV = "22.9.94"

RPM_NAME = "xmoontool-22.9.94-979.9.aarch64.rpm"
RPM_HASH = "1a67e947f23500f8b787260b891bcfc5df3fc053d2afd753059cd8c6943da6c69059d56c8b7f3e32aa0ef360015ba70e28d433658f07f5f3b7ab9ab6ca311d15"

RPROVIDES:${PN} += "moontool \
xmoontool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXm.so.4 \
libXt.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
