SUMMARY = "Python 3 bindings for the libdnf5-cli library"
DESCRIPTION = "Python 3 bindings for the libdnf5-cli library."
LICENSE = "LGPL-2.1-or-later"

PV = "5.4.2.1"

RPM_NAME = "python3-libdnf5-cli-5.4.2.1-1.3.aarch64.rpm"
RPM_HASH = "1033a386bfb29fae2b0bde2840c890dd59a4e951cd4a8273c2a599ed0b996c6b828d063fa5e9934e9abc730b3f30af9133ea80f9668c525bf56a0e4d0c38c96a"

RPROVIDES:${PN} += "python3-libdnf5-cli \
python3.13dist-libdnf5-cli \
python3dist-libdnf5-cli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdnf5-cli.so.3 \
libdnf5-cli3 \
libgcc-s.so.1 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
