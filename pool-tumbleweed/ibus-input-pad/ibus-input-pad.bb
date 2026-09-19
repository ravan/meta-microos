SUMMARY = "Input Pad for IBus"
DESCRIPTION = "The input pad engine for IBus platform."
LICENSE = "GPL-2.0+"

PV = "1.4.99.20140916"

RPM_NAME = "ibus-input-pad-1.4.99.20140916-2.11.aarch64.rpm"
RPM_HASH = "45b98e59671836283378ca03c59f7390d3ebeaf9b14eab21a5d7159dd582de8332ee4ae9b42b4dad79185efb72532e10f62a482119f8bbf694a107d5ba2dcf03"

RPROVIDES:${PN} += "ibus-input-pad"

RDEPENDS:${PN} += "ibus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libibus-1.0.so.5 \
libinput-pad-1.0.so.1"

inherit rpm
