SUMMARY = "A simple thesaurus for Libreoffice"
DESCRIPTION = "Hyphen is a library for high quality hyphenation and justification."
LICENSE = "GPL-2.0-or-later | LGPL-2.0-or-later | MPL-1.1+"

PV = "2.8.9"

RPM_NAME = "libhyphen0-2.8.9-1.3.aarch64.rpm"
RPM_HASH = "b11c4a80fe1fda570cd1e3bb77a0b6c2bfdc87de764679d8fcd0a16fdba94cf66c47a6cf031296eb2015d7895193c57bf1521bb116baba661f3cbe0e784f0189"

RPROVIDES:${PN} += "libhyphen.so.0 \
libhyphen0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
