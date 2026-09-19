SUMMARY = "Python module to handle type-length-value (TLV) encoded data"
DESCRIPTION = "Python module to handle type-length-value (TLV) encoded data 8-bit type, 8-bit length, and N-byte value as described within the Apple HomeKit Accessory Protocol Specification Non-Commercial Version Release R2."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "python314-tlv8-0.10.0-1.12.noarch.rpm"
RPM_HASH = "7d1f64a20368ace06502a8cee388e3e949c4c23d82a62beffb6373ab6fe878931083459a965758fa4e973170eb0aae273887d0736f85800360f053aedac00944"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tlv8 \
python314-tlv8 \
python3dist-tlv8"

RDEPENDS:${PN} += "python-abi"

inherit rpm
