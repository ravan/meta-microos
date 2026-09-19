SUMMARY = "Implementation of the SASL framework and a few common SASL mechanisms"
DESCRIPTION = "GNU SASL is an implementation of the Simple Authentication and \
Security Layer framework and a few common SASL mechanisms. SASL is \
used by network servers (e.g. IMAP, SMTP) to request authentication \
from clients, and in clients to authenticate against servers."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "2.2.4"

RPM_NAME = "gsasl-2.2.4-1.2.aarch64.rpm"
RPM_HASH = "9e77702851ddfbef6acf16b8a400501dcfb028ad3dbffd17aa3f59d9a45c7d30fa962cad6f4238da8535b89242e346293a13a55f41673649b9e8ef68ff295d2b"

RPROVIDES:${PN} += "gsasl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgsasl.so.18"

inherit rpm
