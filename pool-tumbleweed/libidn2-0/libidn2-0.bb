SUMMARY = "Support for Internationalized Domain Names (IDN)"
DESCRIPTION = "An implementation of the IDNA2008 specifications (RFCs 5890, 5891, 5892, 5893)"
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "2.3.8"

RPM_NAME = "libidn2-0-2.3.8-1.5.aarch64.rpm"
RPM_HASH = "109d023768cc2b860e8efd6f9a625ee6b5afc4693ce1006382b8a484ee228d45d3576d4fa0a652cbf873272675c1776fed81348e2b31ff05e10740eee29d9230"

RPROVIDES:${PN} += "libidn2 \
libidn2-0 \
libidn2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libunistring.so.5"

inherit rpm
