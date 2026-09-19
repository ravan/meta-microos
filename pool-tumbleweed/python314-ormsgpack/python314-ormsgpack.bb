SUMMARY = "Fast Python msgpack library supporting dataclasses, datetimes, and numpy"
DESCRIPTION = "ormsgpack is a fast msgpack library for Python. It is a fork of orjson's \
msgpack support and serializes faster than other Python msgpack libraries. \
It supports serializing dataclasses, datetimes, numpy arrays and pydantic \
models natively."
LICENSE = "Apache-2.0 | MIT"

PV = "1.12.2"

RPM_NAME = "python314-ormsgpack-1.12.2-1.4.aarch64.rpm"
RPM_HASH = "1fd172bd37616283de6432b3819918cdd54c1170745527adad42d93f022b133b5fa31ad0d1afdb296eead603680bc092c6a99f1d3bec9dfb7093697978dc5ed7"

RPROVIDES:${PN} += "python3.14dist-ormsgpack \
python314-ormsgpack \
python3dist-ormsgpack"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
