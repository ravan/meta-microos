SUMMARY = "RFC 6570 URI Template Processor"
DESCRIPTION = "RFC 6570 URI Template Processor"
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python313-uri-template-1.3.0-1.12.noarch.rpm"
RPM_HASH = "b9cfe431e81e3d9e4bf1901c44002bdc7a1a1caf2b89ebc2a3fc502df2f7aad460b61fb1cb6d9c0492a9b49d10f0b8e83d1b89d38fd86ade75fc3a39e6ac0387"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uri-template \
python3.13dist-uri-template \
python313-uri-template \
python3dist-uri-template"

RDEPENDS:${PN} += "python-abi"

inherit rpm
