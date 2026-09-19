SUMMARY = "Open a shell inside a running container"
DESCRIPTION = "This utility allows you to run a shell, and use diagnostic \
utilities, inside an already running container. The main \
purpose of this is problem diagnosis."
LICENSE = "GPL-2.0"

PV = "0.2.2"

RPM_NAME = "container-support-utils-0.2.2-1.22.aarch64.rpm"
RPM_HASH = "d77e8e2353f469f547c35d1ed10038e667c5c660851d8a8c49ca2f45fcceb9f2abe07ad73f67da20d21e1d03c18be5b53aef34a62acdb0e084076fa47162dcc2"

RPROVIDES:${PN} += "container-support-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
