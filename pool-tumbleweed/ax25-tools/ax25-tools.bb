SUMMARY = "AX.25 tools"
DESCRIPTION = "These are the support utilities required to make use of the internal \
AX.25, NET/ROM and Rose support in the linux kernel. The ax25tools are \
mostly configuration utilities, applications can be found in the \
package ax25apps."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.10rc5"

RPM_NAME = "ax25-tools-0.0.10rc5-2.7.aarch64.rpm"
RPM_HASH = "8031d598bd13c3b417b62b97b73bab25e1ac31cc42c3518c099faaa99d22dd0db82bcf8f65d7d0091fe9688be17d56342cf7e434be0161b25c825a7de74af63d"

RPROVIDES:${PN} += "ax25-tools \
config-ax25-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libax25.so.0 \
libc.so.6 \
libz.so.1"

inherit rpm
