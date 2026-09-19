SUMMARY = "Modules for dico"
DESCRIPTION = "GNU Dico is a flexible modular implementation of DICT server (RFC 2229). In \
contrast to another implementations, it does not depend on particular \
database format. GNU Dico handles database accesses using loadable modules. \
 \
This package contains extensions and modules for dico."
LICENSE = "GPL-3.0-or-later"

PV = "2.12"

RPM_NAME = "dico-modules-2.12-2.5.aarch64.rpm"
RPM_HASH = "a5ee689de6ba5560abb3139338967fc599b3760f5cb55b15275ee181be330cd632b76a764f2a7dd4f4946602e42e9f37eff4775e4a2e7cd197d9aa43af428bc8"

RPROVIDES:${PN} += "dico-modules"

RDEPENDS:${PN} += "dico \
ld-linux-aarch64.so.1 \
libWN.so.3 \
libc.so.6 \
libdico.so.2 \
libguile-3.0.so.1 \
libldap.so.2 \
libpam.so.0 \
libpcre2-8.so.0 \
libpython3.13.so.1.0 \
libz.so.1"

inherit rpm
