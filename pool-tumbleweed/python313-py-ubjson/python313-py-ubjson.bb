SUMMARY = "Universal Binary JSON encoder/decoder"
DESCRIPTION = "This is a Python v3.2+ (and 2.7+) `Universal Binary JSON` \
encoder/decoder based on the `draft-12` specification."
LICENSE = "Apache-2.0"

PV = "0.16.1"

RPM_NAME = "python313-py-ubjson-0.16.1-2.7.aarch64.rpm"
RPM_HASH = "ba22b5008f9770fab4193f13b65285cf2d6bdf88b97812ad8a9b0355333a5efaa021eeb01dc0823a5260fba623c0322ca74ac8b7c3dfe5861a6ab62f76e2bb41"

RPROVIDES:${PN} += "python3-py-ubjson \
python3.13dist-py-ubjson \
python313-py-ubjson \
python3dist-py-ubjson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
