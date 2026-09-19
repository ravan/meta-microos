SUMMARY = "The GNU Compiler Collection targeting pru"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting pru. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "13.5.0+git10516"

RPM_NAME = "cross-pru-gcc13-bootstrap-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "6a512c4b878fd47dbacda7dae825fbb700a379070466e9f9e14e9193f0a2bf6c67d0ac3c2338ab7480cd77f6479883f4e264df5d0f76e002b617f47e34b93ca9"

RPROVIDES:${PN} += "cross-pru-gcc13-bootstrap \
pru-gcc"

RDEPENDS:${PN} += "cross-pru-binutils \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
