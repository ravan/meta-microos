SUMMARY = "Immutable collections for Python"
DESCRIPTION = "Immutable collections for Python."
LICENSE = "Apache-2.0"

PV = "0.21"

RPM_NAME = "python313-immutables-0.21-2.7.aarch64.rpm"
RPM_HASH = "d16a34b95fe4958f64a1eb53426ecf6d012b5e5b5cbdd26e41a42dbf2cf68fe45c8207fdf8f4461917153b4959f65de4e3ee7f3b5d309e208992e6b9afade239"

RPROVIDES:${PN} += "python3-immutables \
python3.13dist-immutables \
python313-immutables \
python3dist-immutables"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
