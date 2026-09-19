SUMMARY = "Clapper Enhancer LBRY"
DESCRIPTION = "Stream LBRY vidoes within Clapper"
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "clapper-enhancers-lbry-0.10.0-1.4.aarch64.rpm"
RPM_HASH = "91deaf134a57c1916a70c98393708e6039877ef23bff181a0632529dad521a30d96b2945bcb8f4d3a78cd962ebc023fceb5b768b6590d8674d8cade99d342140"

RPROVIDES:${PN} += "clapper-enhancers-lbry \
libclapper-lbry.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libclapper-0.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libjson-glib-1.0.so.0 \
libpeas-2.so.0 \
libsoup-3.0.so.0"

inherit rpm
