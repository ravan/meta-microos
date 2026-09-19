SUMMARY = "libreport command line interface"
DESCRIPTION = "This package contains simple command line tool for working \
with problem dump reports"
LICENSE = "GPL-2.0-or-later"

PV = "2.17.15"

RPM_NAME = "libreport-cli-2.17.15-1.13.aarch64.rpm"
RPM_HASH = "0dd948e3c2e556d7e93acb585764ba243bf41f0581f49bbbc5d2f03fcb7fde5dca4ec184a0b742bc1485109b68eefe642a8aa1a47e520e6680a72c5eead77814"

RPROVIDES:${PN} += "libreport-cli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libreport-2 \
libreport.so.2"

inherit rpm
