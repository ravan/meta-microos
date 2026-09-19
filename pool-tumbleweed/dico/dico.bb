SUMMARY = "Flexible modular implementation of DICT server (RFC 2229)"
DESCRIPTION = "GNU Dico is a flexible modular implementation of DICT server (RFC 2229). In \
contrast to another implementations, it does not depend on particular \
database format. GNU Dico handles database accesses using loadable modules."
LICENSE = "GPL-3.0-or-later"

PV = "2.12"

RPM_NAME = "dico-2.12-2.5.aarch64.rpm"
RPM_HASH = "4bbe510f5f4ff68a1f2801841d48fc1160a96d926c8aa3a483aabedf62ec6bbc40ff81b0f61bb6988346f1fdc2e2cdae4063b6a3cafddde81162b93cbd0a74e1"

RPROVIDES:${PN} += "dico"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libdico.so.2 \
libgsasl.so.18 \
libltdl.so.7 \
libreadline.so.8 \
m4"

inherit rpm
