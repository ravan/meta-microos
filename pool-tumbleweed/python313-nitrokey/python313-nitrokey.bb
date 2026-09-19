SUMMARY = "Nitrokey Python SDK"
DESCRIPTION = "The Nitrokey Python SDK can be used to use and configure Nitrokey devices."
LICENSE = "Apache-2.0"

PV = "0.4.2"

RPM_NAME = "python313-nitrokey-0.4.2-3.2.noarch.rpm"
RPM_HASH = "21ccb7214530783b81350de5e2f44fa76edea8e44dc02292d0ee46e6e57e7c0457e899c9c1f6b3cf9a1f198aa18b4f871978ccdf4445c1b3790c087f7fb4a1c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nitrokey \
python3.13dist-nitrokey \
python313-nitrokey \
python3dist-nitrokey"

RDEPENDS:${PN} += "-python313-crcmod >= 1.7 with python313-crcmod < 2 \
-python313-fido2 >= 1.1.2 with python313-fido2 < 3 \
-python313-hidapi >= 0.14 with python313-hidapi < 0.15 \
-python313-protobuf >= 5.26 \
-python313-pyserial >= 3.5 with python313-pyserial < 4 \
-python313-requests >= 2 with python313-requests < 3 \
-python313-semver >= 3 with python313-semver < 4 \
-python313-tlv8 >= 0.10 with python313-tlv8 < 0.11 \
python-abi \
python313-cryptography"

inherit rpm
