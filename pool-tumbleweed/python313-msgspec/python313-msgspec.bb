SUMMARY = "A fast serialization and validation library"
DESCRIPTION = "A fast serialization and validation library, with builtin support for JSON, MessagePack, YAML, and TOML."
LICENSE = "BSD-3-Clause"

PV = "0.19.0"

RPM_NAME = "python313-msgspec-0.19.0-1.6.aarch64.rpm"
RPM_HASH = "374927d5b4991fee78e81d9c0507eafd3ea39cfa82557a0c41b0a1b18f3c6c15d2f9c9fd67a62c01c42569464ff11afc946b9d5d648c6699bd370dbc2e0b457f"

RPROVIDES:${PN} += "python3-msgspec \
python3.13dist-msgspec \
python313-msgspec \
python3dist-msgspec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
