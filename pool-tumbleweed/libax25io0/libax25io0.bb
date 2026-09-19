SUMMARY = "AX.25 data link layer protocol library"
DESCRIPTION = "Libraries for AX.25. AX.25 (Amateur X.25) is a data link layer \
protocol derived from the X.25 protocol suite and designed for use by \
amateur radio operators."
LICENSE = "LGPL-2.1-or-later"

PV = "0.0.12~rc5"

RPM_NAME = "libax25io0-0.0.12~rc5-2.6.aarch64.rpm"
RPM_HASH = "4416bf6561eb70438f56e5aee5b5c99f2daa9070c06ac74ff9ad204be0363ca6bdea1fe2a49c18324a9f1741da6471578baee65a41889c70a7c6d3efc23d7591"

RPROVIDES:${PN} += "libax25io.so.0 \
libax25io0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libax25-common \
libc.so.6"

inherit rpm
