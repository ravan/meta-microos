SUMMARY = "OpenStack serialization library"
DESCRIPTION = "The oslo.serialization library provides support for representing objects \
in transmittable and storable formats, such as Base64, JSON and MessagePack."
LICENSE = "Apache-2.0"

PV = "5.11.0"

RPM_NAME = "python314-oslo.serialization-5.11.0-1.1.noarch.rpm"
RPM_HASH = "546c0ceeb89023a8510bc62fec019d6512bce20b6ef2fb48c87033597a3c537bcd0dec1fe8bd487fbfb7c8f1c6e25d9178cab181239641a9c3a4f15f271d28ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-oslo.serialization \
python314-oslo.serialization \
python3dist-oslo.serialization"

RDEPENDS:${PN} += "python-abi \
python314-msgpack \
python314-oslo.utils"

inherit rpm
