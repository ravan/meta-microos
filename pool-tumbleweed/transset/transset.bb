SUMMARY = "Simple program to make windows transparent"
DESCRIPTION = "transset manipulates the _NET_WM_WINDOW_OPACITY property to make \
windows transparent."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "transset-1.0.4-1.5.aarch64.rpm"
RPM_HASH = "b16cdeb45c98841cf2448f55a556265411a166341c393cb65890c8c619374e68571954c8738481535dfb0ee6e7dbdc3c47fc82d53b5bbb0134b7ef8aae72e060"

RPROVIDES:${PN} += "transset"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
