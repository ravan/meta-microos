SUMMARY = "MMS stream protocol library"
DESCRIPTION = "LibMMS is a common library for parsing mms:// and mmsh:// type network streams. \
These are commonly used to stream Windows Media Video content over the web. \
LibMMS itself is only for receiving MMS stream, it doesn't handle sending at \
all."
LICENSE = "LGPL-2.1+"

PV = "0.6.4"

RPM_NAME = "libmms0-0.6.4-6.9.aarch64.rpm"
RPM_HASH = "df634082ba9f930ed9f3f37b3145c0bed461fa618a9816d35109ab36c5bbccae7c5353f131929ddd195065de48c9bfa4e18ece08f5e2c0b0fd54c3aa8ac54450"

RPROVIDES:${PN} += "libmms.so.0 \
libmms0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
