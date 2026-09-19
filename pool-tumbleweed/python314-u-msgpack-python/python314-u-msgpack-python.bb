SUMMARY = "A MessagePack serializer and deserializer"
DESCRIPTION = "u-msgpack-python is a MessagePack serializer and \
deserializer module written in pure Python, compatible with \
Python 2, Python 3, in both the CPython and PyPy implementations of \
Python. u-msgpack-python is fully compliant with the MessagePack \
2017-09-17 specification. In particular, it supports the binary, \
UTF-8 string, and application-defined extended types."
LICENSE = "MIT"

PV = "2.8.0"

RPM_NAME = "python314-u-msgpack-python-2.8.0-2.5.noarch.rpm"
RPM_HASH = "1c4afaedd6abc9c7a671a035a9efa4a1d19f1911040b35f02aae68d22a5eec66f64ad51e100c57dd3631d4f1e60e9c3b01a21df05755e0ab5b16ec8058ba26e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-u-msgpack-python \
python314-u-msgpack-python \
python3dist-u-msgpack-python"

RDEPENDS:${PN} += "python-abi"

inherit rpm
