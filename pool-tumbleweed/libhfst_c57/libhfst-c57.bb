SUMMARY = "Helsinki Finite-State Transducer C API Library"
DESCRIPTION = "The Helsinki Finite-State Transducer software is intended for the \
implementation of morphological analyzers and other tools which are \
based on weighted and unweighted finite-state transducer technology."
LICENSE = "GPL-3.0-only"

PV = "3.17.3"

RPM_NAME = "libhfst_c57-3.17.3-1.1.aarch64.rpm"
RPM_HASH = "129b7c577340bfc0cad4e19e162386c31e7c963ca1e62d06c10304756430e41c45a9a157ab687aa7f1715dd9b16f773b18ab70e8f07ed3cf9cc540192da6755c"

RPROVIDES:${PN} += "libhfst-c.so.57 \
libhfst-c57"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhfst.so.57 \
libstdc++.so.6"

inherit rpm
