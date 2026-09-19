SUMMARY = "Perl interface to the cairo 2d vector graphics library"
DESCRIPTION = "Perl interface to the cairo 2d vector graphics library"
LICENSE = "LGPL-2.1-or-later"

PV = "1.109"

RPM_NAME = "perl-Cairo-1.109-2.12.aarch64.rpm"
RPM_HASH = "144ca060c13e3ae9883cbe6db72e1586cf063ed01cd8df3ea67853da74e7b1c31a8aaca93c177d3f1aa2cfac65dea43590f87b8e127500eeaa17f9a22f01eee1"

RPROVIDES:${PN} += "perl-Cairo \
perl-Cairo--Install--Files"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
perl--MODULE-COMPAT-5.44.0 \
perl-ExtUtils--Depends \
perl-ExtUtils--PkgConfig"

inherit rpm
