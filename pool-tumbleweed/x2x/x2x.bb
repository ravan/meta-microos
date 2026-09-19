SUMMARY = "X Window System Display Remote Control"
DESCRIPTION = "x2x allows the keyboard and mouse on one ('from') X Window System \
display to be used to control another ('to') X Window System display."
LICENSE = "GPL-2.0-or-later"

PV = "1.30rc1+git.20180517"

RPM_NAME = "x2x-1.30rc1+git.20180517-2.7.aarch64.rpm"
RPM_HASH = "54164b3aecf7f5e1effe37a016ca3abb4767ad5a9b791285e908d8a6885c9d558948df26191a0391672cfd3c2d6a27e718f7cca5152c15e4831ba2854e4c91bc"

RPROVIDES:${PN} += "x2x"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXtst.so.6 \
libc.so.6"

inherit rpm
