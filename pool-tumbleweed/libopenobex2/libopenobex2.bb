SUMMARY = "Open Source Implementation of the Object Exchange (OBEX) Protocol"
DESCRIPTION = "OBEX is a session protocol and can best be described as a binary HTTP \
protocol. OBEX is optimized for ad-hoc wireless links and can be used \
to exchange all kind of objects, like files, pictures, calendar entries \
(vCal), and business cards (vCard)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.7.2"

RPM_NAME = "libopenobex2-1.7.2-3.14.aarch64.rpm"
RPM_HASH = "acd1730bef454b15027b78409acdbdf2350f94936a0f8a05ae4cd8e6d0c4032aab2b563ff816f08058539affe7fa989c2e916b422fd413aab260ea860cdc479f"

RPROVIDES:${PN} += "libopenobex.so.2 \
libopenobex2 \
openobex"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
