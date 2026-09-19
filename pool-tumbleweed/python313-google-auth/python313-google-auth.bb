SUMMARY = "Google Authentication Library"
DESCRIPTION = "This library simplifies using Google’s various server-to-server authentication mechanisms to access Google APIs."
LICENSE = "Apache-2.0"

PV = "2.57.0"

RPM_NAME = "python313-google-auth-2.57.0-1.1.noarch.rpm"
RPM_HASH = "b88f9c21a446b485fa0c570e62535b15a5aa16bef022445123091216042b8906bb1b869565a1208b46ca66747da6654fd1a8d3042f219ff131735b6a7bcbee4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-auth \
python3.13dist-google-auth \
python313-google-auth \
python3dist-google-auth"

RDEPENDS:${PN} += "python-abi \
python313-cryptography \
python313-grpcio \
python313-pyasn1-modules \
python313-urllib3"

inherit rpm
