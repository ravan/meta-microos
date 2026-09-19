SUMMARY = "A phone dialer and call handler"
DESCRIPTION = "A phone dialer and call handler. \
 \
Calls is also a capable sip-client."
LICENSE = "GPL-3.0-only & MIT"

PV = "50.0"

RPM_NAME = "calls-50.0-1.2.aarch64.rpm"
RPM_HASH = "b2c4fd5757142e3f16ae54bd33929006bd621f001048b2a05ead193c964ca9169827b26de31660a167749eb7b373efa4255256f255e721e0b5546586df61015e"

RPROVIDES:${PN} += "calls \
libdummy.so \
libmm.so \
libsip.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcallaudio-0.1.so.0 \
libebook-contacts-1.2.so.5 \
libfeedback-0.0.so.0 \
libfolks.so.26 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgom-1.0.so.0 \
libgsound.so.0 \
libgstreamer-1.0.so.0 \
libgtk-4.so.1 \
libmm-glib.so.0 \
libpeas-2.so.0 \
libsecret-1.so.0 \
libsofia-sip-ua-glib.so.3 \
libsofia-sip-ua.so.0"

inherit rpm
