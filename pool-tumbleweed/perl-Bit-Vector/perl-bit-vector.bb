SUMMARY = "Bit::Vector Perl module"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "7.400.0"

RPM_NAME = "perl-Bit-Vector-7.400.0-2.8.aarch64.rpm"
RPM_HASH = "0ab72a619e4e7b4d9b91bba4a2c3e349c1e754d63f05464c28d279b159cf65fcca958fef6ee6f714fae58ef138f26c997a1a54543f5f51b3d18e6b871bd6196a"

RPROVIDES:${PN} += "perl-Bit--Vector \
perl-Bit--Vector--Overload \
perl-Bit--Vector--String \
perl-Bit-Vector"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-Carp--Clan \
perl-Storable"

inherit rpm
