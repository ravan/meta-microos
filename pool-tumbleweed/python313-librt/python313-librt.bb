SUMMARY = "Mypyc runtime library"
DESCRIPTION = "Mypyc runtime library"
LICENSE = "MIT"

PV = "0.15.0"

RPM_NAME = "python313-librt-0.15.0-1.1.aarch64.rpm"
RPM_HASH = "2e95f1c563ee58c720b9b56b6a79f53aa8e7e325e6945b87c4522c7868c539e77ce290f911ff157dd542a1e690c8805c18f19c2f9c99618db00aaf91f22a557c"

RPROVIDES:${PN} += "python3-librt \
python3.13dist-librt \
python313-librt \
python3dist-librt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
