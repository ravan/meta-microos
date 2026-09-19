SUMMARY = "Alternate keyring implementations"
DESCRIPTION = "Alternate keyring backend implementations for use with the \
keyring package."
LICENSE = "MIT"

PV = "5.0.2"

RPM_NAME = "python313-keyrings.alt-5.0.2-1.5.noarch.rpm"
RPM_HASH = "0aaed03e76cdbc2f8d1b3bbf383596a5d94d8d3890da40f3e10408b2ab9afb2cee13d33d56fbf32a1a51f25dfbbadbcd6a2498fb5106dc8ff01c5b130b983e93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-keyrings.alt \
python3.13dist-keyrings.alt \
python313-keyrings.alt \
python3dist-keyrings.alt"

RDEPENDS:${PN} += "python-abi \
python313-jaraco.classes \
python313-jaraco.context"

inherit rpm
