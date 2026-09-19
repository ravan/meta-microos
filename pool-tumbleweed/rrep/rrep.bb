SUMMARY = "Recursive pattern replacement utility"
DESCRIPTION = "rrep is a pattern replacement utility.  It comes with support for regular \
expressions, recursive directory processing, backup, simulation and prompting. \
The replacement string may contain special characters to refer to portions of \
the matched pattern."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.7"

RPM_NAME = "rrep-1.3.7-1.14.aarch64.rpm"
RPM_HASH = "fde906a30a586fb611537d8ebca7f22aad3ac17c9b4ae598d647f1318c3b681abbc40510e3c2115a5f7a76ad8e7fa8946dfc915244c91e880a94c2b26ddd7d47"

RPROVIDES:${PN} += "rrep"

RDEPENDS:${PN} += "/usr/bin/sh \
info \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6"

inherit rpm
