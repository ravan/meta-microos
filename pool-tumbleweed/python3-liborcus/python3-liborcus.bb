SUMMARY = "Python bindings for liborcus"
DESCRIPTION = "Python 3 bindings for liborcus."
LICENSE = "MPL-2.0"

PV = "0.21.0"

RPM_NAME = "python3-liborcus-0.21.0-1.4.aarch64.rpm"
RPM_HASH = "ea7696b10d43881f29a9f2fe5363f1d4449796b527769f12852c0281d52313720ade2333d527a68bd19452d0ef7fe3a10b4d84d4b7c89395d629b8b7afc17dfe"

RPROVIDES:${PN} += "liborcus-python3 \
python3-liborcus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libixion-0.20.so.0 \
liborcus-0.21.so.0 \
liborcus-parser-0.21.so.0 \
liborcus-spreadsheet-model-0.21.so.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
