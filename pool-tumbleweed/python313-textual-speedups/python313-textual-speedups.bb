SUMMARY = "None"
DESCRIPTION = "None"
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python313-textual-speedups-0.2.1-3.4.aarch64.rpm"
RPM_HASH = "feb85ac83422bd9abaf245127ad1625558d60ba76f64e5d649f3c6ae2a3e859f1517b3e616ef7a5bf0e21139aac0570272bd9e5dd584fa4caca40c3d1f8172b8"

RPROVIDES:${PN} += "python3-textual-speedups \
python3.13dist-textual-speedups \
python313-textual-speedups \
python3dist-textual-speedups"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
