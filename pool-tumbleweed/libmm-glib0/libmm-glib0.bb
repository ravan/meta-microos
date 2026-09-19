SUMMARY = "Glib bindings for the modem handling DBus interface"
DESCRIPTION = "DBus interface for modem handling. Provides a standard abstracted API \
(over DBus) to communicate with all sorts of modems (landline, GSM, \
CDMA)."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.24.2"

RPM_NAME = "libmm-glib0-1.24.2-1.6.aarch64.rpm"
RPM_HASH = "159dd6cb63cd0d7b2aeb829ec2fe43bfe787249c8f23a8e341146234c23f885fa3914e16290bc830973db0f7900a4cbf40617ccc66a46eb6cec773992cb14da9"

RPROVIDES:${PN} += "libmm-glib.so.0 \
libmm-glib0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
