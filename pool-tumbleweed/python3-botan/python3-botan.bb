SUMMARY = "Botan python bindings"
DESCRIPTION = "This package contains the python bindings to libbotan's C98 interface."
LICENSE = "BSD-2-Clause"

PV = "3.13.0"

RPM_NAME = "python3-botan-3.13.0-1.1.aarch64.rpm"
RPM_HASH = "c25d1678bdb105bc1b382968ca9517e34d41b1d8c85f1cbd54121b8a43a58c7cfc87b7d1b5317bc7a4fe7199def338b7d45f8541792a90646a0d0ab7afcd9d28"

RPROVIDES:${PN} += "python3-botan"

RDEPENDS:${PN} += "python-abi \
python3"

inherit rpm
