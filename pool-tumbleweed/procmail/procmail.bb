SUMMARY = "A program for local e-mail delivery"
DESCRIPTION = "Sendmail calls procmail to deliver email into a local folder. Procmail \
can be configured to store e-mail in different folders."
LICENSE = "Artistic-1.0 | GPL-2.0-or-later"

PV = "3.24"

RPM_NAME = "procmail-3.24-5.5.aarch64.rpm"
RPM_HASH = "583c4c78836851ae91dfe83e9fae8130c4a63e4fd6c23202e38068966233796bb6a7d5172c9b5ae24011a85f1dfc65ab716342751d0cf287e78fba9bffcfa562"

RPROVIDES:${PN} += "procmail"

RDEPENDS:${PN} += "/usr/bin/sed \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
