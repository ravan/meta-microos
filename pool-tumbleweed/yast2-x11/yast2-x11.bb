SUMMARY = "YaST2 - X11 support"
DESCRIPTION = "This package contains the programs and files for YaST2 X11 support."
LICENSE = "GPL-2.0-only"

PV = "5.0.2"

RPM_NAME = "yast2-x11-5.0.2-1.11.aarch64.rpm"
RPM_HASH = "32be4b78a68edfb389757118988f4559bfcb0b4f6c36d37e2cbc43fdc5aaafd90083caf7898c15a7bd24623d9a5f61724308833ab0b179ea9714986d749b7480"

RPROVIDES:${PN} += "yast2-x11"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXmu.so.6 \
libc.so.6 \
systemd \
yast2-theme"

inherit rpm
