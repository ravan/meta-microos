SUMMARY = "Nitrokey Python SDK"
DESCRIPTION = "The Nitrokey Python SDK can be used to use and configure Nitrokey devices."
LICENSE = "Apache-2.0"

PV = "0.4.2"

RPM_NAME = "python314-nitrokey-0.4.2-3.2.noarch.rpm"
RPM_HASH = "4c7f3491dfa06b23403aa08054d3230b54adbc7d960f5173f933b609c5ec16703aefa1323f4facecea5d254f27ba20c9e65b5c26c8242752265114251448f907"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-nitrokey \
python314-nitrokey \
python3dist-nitrokey"

RDEPENDS:${PN} += "-python314-crcmod >= 1.7 with python314-crcmod < 2 \
-python314-fido2 >= 1.1.2 with python314-fido2 < 3 \
-python314-hidapi >= 0.14 with python314-hidapi < 0.15 \
-python314-protobuf >= 5.26 \
-python314-pyserial >= 3.5 with python314-pyserial < 4 \
-python314-requests >= 2 with python314-requests < 3 \
-python314-semver >= 3 with python314-semver < 4 \
-python314-tlv8 >= 0.10 with python314-tlv8 < 0.11 \
python-abi \
python314-cryptography"

inherit rpm
