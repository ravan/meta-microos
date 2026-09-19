SUMMARY = "Fast Python msgpack library supporting dataclasses, datetimes, and numpy"
DESCRIPTION = "ormsgpack is a fast msgpack library for Python. It is a fork of orjson's \
msgpack support and serializes faster than other Python msgpack libraries. \
It supports serializing dataclasses, datetimes, numpy arrays and pydantic \
models natively."
LICENSE = "Apache-2.0 | MIT"

PV = "1.12.2"

RPM_NAME = "python313-ormsgpack-1.12.2-1.4.aarch64.rpm"
RPM_HASH = "581e88a6283309da028009a71a9970273154194e3affaa8ecb054846750583b5cdb9adfefedd94ec377af55f1b0b77f537c189a594d63f8ddfd2bd40be2e9edd"

RPROVIDES:${PN} += "python3-ormsgpack \
python3.13dist-ormsgpack \
python313-ormsgpack \
python3dist-ormsgpack"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
