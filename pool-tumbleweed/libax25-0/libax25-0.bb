SUMMARY = "AX.25 data link layer protocol library"
DESCRIPTION = "Libraries for AX.25. AX.25 (Amateur X.25) is a data link layer \
protocol derived from the X.25 protocol suite and designed for use by \
amateur radio operators."
LICENSE = "LGPL-2.1-or-later"

PV = "0.0.12~rc5"

RPM_NAME = "libax25-0-0.0.12~rc5-2.6.aarch64.rpm"
RPM_HASH = "3356deef551a1a864bd9a63d82d2535f99bebd125557158b934a2042b6dbf43329aa4d57c94abe669547ee3329cd5da30ba1d7c841e785aa0cd14445a863878d"

RPROVIDES:${PN} += "libax25-0 \
libax25.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libax25-common \
libc.so.6"

inherit rpm
