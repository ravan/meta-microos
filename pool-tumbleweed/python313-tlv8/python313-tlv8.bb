SUMMARY = "Python module to handle type-length-value (TLV) encoded data"
DESCRIPTION = "Python module to handle type-length-value (TLV) encoded data 8-bit type, 8-bit length, and N-byte value as described within the Apple HomeKit Accessory Protocol Specification Non-Commercial Version Release R2."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "python313-tlv8-0.10.0-1.12.noarch.rpm"
RPM_HASH = "fe50cae9fba9d9241a22ccc4260f186ff2e8b065b77966e4cf3cca3dab2abe5b1eed4e7e055609037e479cd56d02c441f2559729fafe4b88a523f6c2744856d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tlv8 \
python3.13dist-tlv8 \
python313-tlv8 \
python3dist-tlv8"

RDEPENDS:${PN} += "python-abi"

inherit rpm
