SUMMARY = "Utilities for manipulating correlated Gaussian random variables"
DESCRIPTION = "Utilities for manipulating correlated Gaussian random variables."
LICENSE = "GPL-3.0-only"

PV = "13.1.9"

RPM_NAME = "python314-gvar-13.1.9-1.5.aarch64.rpm"
RPM_HASH = "6c94e7b672bf6d71abefec32031c6be3b2cd5550038d63dd96c48b0d87e5aa51b63a70856ba933920647a92e7fb202bb510390159f415941562cf33ed118a8fb"

RPROVIDES:${PN} += "python3.14dist-gvar \
python314-gvar \
python3dist-gvar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-numpy \
python314-scipy"

inherit rpm
