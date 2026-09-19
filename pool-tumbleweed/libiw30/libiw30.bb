SUMMARY = "Tools for a wireless LAN"
DESCRIPTION = "This package contains the wireless tools, used to manipulate the \
wireless extensions. The wireless extension is an interface that allows \
you to set wireless LAN specific parameters and get specific stats."
LICENSE = "GPL-2.0-only"

PV = "30.pre9"

RPM_NAME = "libiw30-30.pre9-41.9.aarch64.rpm"
RPM_HASH = "e4c89d9772a12d64e3ed1e5951cd07f5fe99738c90e8799b762828ceaa74e132646daaf1e7d4213727763339f90b8a2ee61b9fcca7fd3eedcb680381030917aa"

RPROVIDES:${PN} += "libiw \
libiw.so.30 \
libiw30"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
