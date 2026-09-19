SUMMARY = "Library to import QuarkXPress documents"
DESCRIPTION = "libqxp is library providing ability to interpret and import QuarkXPress \
document formats into various applications. Currently it only supports \
QuarkXPress 3.1-4.1."
LICENSE = "MPL-2.0"

PV = "0.0.3"

RPM_NAME = "libqxp-0_0-0-0.0.3-2.3.aarch64.rpm"
RPM_HASH = "76a4774755d0acb11ed5339b1756a11b92d801ede89c4fa4f0bd11defeb21d925f5df717d9a35fd61d9d52fc04cd39c73711147c204b35fdd73d9aa4d7273b04"

RPROVIDES:${PN} += "libqxp-0-0-0 \
libqxp-0.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libicuuc.so.78 \
libm.so.6 \
librevenge-0.0.so.0 \
libstdc++.so.6"

inherit rpm
