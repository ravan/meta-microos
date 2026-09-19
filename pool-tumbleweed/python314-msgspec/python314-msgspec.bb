SUMMARY = "A fast serialization and validation library"
DESCRIPTION = "A fast serialization and validation library, with builtin support for JSON, MessagePack, YAML, and TOML."
LICENSE = "BSD-3-Clause"

PV = "0.19.0"

RPM_NAME = "python314-msgspec-0.19.0-1.6.aarch64.rpm"
RPM_HASH = "af6e1c73b6af3bd3906fa5fcca0ca60c056d95a4ed0a65c82995168bac610d74bccab436f342d4726ba43c61314e24aadf6524bf97aeae7633fa50d8fa8d96d3"

RPROVIDES:${PN} += "python3.14dist-msgspec \
python314-msgspec \
python3dist-msgspec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
