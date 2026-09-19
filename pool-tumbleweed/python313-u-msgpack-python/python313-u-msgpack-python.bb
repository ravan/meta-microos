SUMMARY = "A MessagePack serializer and deserializer"
DESCRIPTION = "u-msgpack-python is a MessagePack serializer and \
deserializer module written in pure Python, compatible with \
Python 2, Python 3, in both the CPython and PyPy implementations of \
Python. u-msgpack-python is fully compliant with the MessagePack \
2017-09-17 specification. In particular, it supports the binary, \
UTF-8 string, and application-defined extended types."
LICENSE = "MIT"

PV = "2.8.0"

RPM_NAME = "python313-u-msgpack-python-2.8.0-2.5.noarch.rpm"
RPM_HASH = "cf5835e7560bca32ec952447acf3d4e3d28a7ff2cf495b00afe932282f542aa33aeec43cc5a2740e5a422e95db160fa8e547a6f0cf2b52a0be721e72ee1a667b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-u-msgpack-python \
python3.13dist-u-msgpack-python \
python313-u-msgpack-python \
python3dist-u-msgpack-python"

RDEPENDS:${PN} += "python-abi"

inherit rpm
