SUMMARY = "Implementation of the SASL framework and a few common SASL mechanisms"
DESCRIPTION = "GNU SASL is an implementation of the Simple Authentication and \
Security Layer framework and a few common SASL mechanisms. SASL is \
used by network servers (e.g. IMAP, SMTP) to request authentication \
from clients, and in clients to authenticate against servers."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "2.2.4"

RPM_NAME = "libgsasl18-2.2.4-1.2.aarch64.rpm"
RPM_HASH = "ac2c40a553be0199f578b7a2725257b73d4228883525d0613212a608a191fabfe547f8fbddc279f53775c41409dc2d08138790d53dc696fe84fc952963ff31eb"

RPROVIDES:${PN} += "libgsasl.so.18 \
libgsasl18"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2 \
libidn.so.12"

inherit rpm
