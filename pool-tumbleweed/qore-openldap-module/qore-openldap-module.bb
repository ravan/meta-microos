SUMMARY = "OPENLDAP module for Qore"
DESCRIPTION = "This package contains the openldap module for the Qore Programming Language. \
 \
This module exposes functionality from the openldap library as a Qore API."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.2.3"

RPM_NAME = "qore-openldap-module-1.2.3-5.6.aarch64.rpm"
RPM_HASH = "4d481bf68d0a9e164cf212d4409d475880955fd884cedfd2810695555b516d4a2cf77027c22f404a054af193dffc973718a5a9a6367cb657d19a354aa40190f1"

RPROVIDES:${PN} += "qore-openldap-module"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libldap.so.2 \
libstdc++.so.6 \
qore-module-abi"

inherit rpm
