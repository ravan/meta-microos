SUMMARY = "Perl interface to zlib/zlib-ng compression libraries"
DESCRIPTION = "The _Compress::Raw::Zlib_ module provides a Perl interface to the _zlib_ or \
_zlib-ng_ compression libraries (see SEE ALSO for details about where to \
get _zlib_ or _zlib-ng_). \
 \
In the text below all references to _zlib_ are also applicable to _zlib-ng_ \
unless otherwise stated."
LICENSE = "(Artistic-1.0 | GPL-1.0-or-later) & Zlib"

PV = "2.224"

RPM_NAME = "perl-Compress-Raw-Zlib-2.224-1.1.aarch64.rpm"
RPM_HASH = "02c85084468f9c0e84a403f0244eb6bc1f4013a5463e589acbc1a77911381a0e8ee3abd1c34075beba4bb0f30695dfaf5305fbad7f18f67d09726c9059b7efa2"

RPROVIDES:${PN} += "perl-Compress--Raw--Zlib \
perl-Compress-Raw-Zlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
