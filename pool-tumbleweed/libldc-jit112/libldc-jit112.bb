SUMMARY = "The LDC jit library"
DESCRIPTION = "This package includes ldc's jit library."
LICENSE = "Artistic-1.0 & BSD-3-Clause"

PV = "1.42.0"

RPM_NAME = "libldc-jit112-1.42.0-1.3.aarch64.rpm"
RPM_HASH = "0ed6a0f746e023910018b57ee98dd59e24dbe3986b7cb9ecff220749dabd6b73739fe95004cf6ed20a9550da4956a65ac94654e3c4d64d1105f14ba86360783c"

RPROVIDES:${PN} += "libldc-jit.so.112 \
libldc-jit112"

RDEPENDS:${PN} += "/sbin/ldconfig \
libLLVM.so.19.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
