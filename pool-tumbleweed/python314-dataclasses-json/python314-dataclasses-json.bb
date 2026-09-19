SUMMARY = "API for encoding and decoding dataclasses to and from JSON"
DESCRIPTION = "This library provides a simple API for encoding and decoding dataclasses to and from JSON. \
 \
It's very easy to get started."
LICENSE = "MIT"

PV = "0.6.7"

RPM_NAME = "python314-dataclasses-json-0.6.7-7.1.noarch.rpm"
RPM_HASH = "6d46de5aab73eeb9704ac9b8bfc9a5de0493afb950ccf0ae1a97ca3ca39fa389de3d66ac554f1d34f92a80c4a25a979ced74116a1a5e17cec1dcc28f50642321"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dataclasses-json \
python314-dataclasses-json \
python3dist-dataclasses-json"

RDEPENDS:${PN} += "python-abi \
python314-marshmallow \
python314-typing-inspect"

inherit rpm
