SUMMARY = "Verify if an email address is valid and really exists"
DESCRIPTION = "Validate_email is a package for Python that check if an email is valid, \
properly formatted and really exists."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3"

RPM_NAME = "python313-validate_email-1.3-5.5.noarch.rpm"
RPM_HASH = "c7cfae9ddaca0df72d6bc0f2c8ae61dc7abb90080d55254cbbfa9e5184dfaf71e8256e1b9902819ef2e237b01819fe68f53634fb7777de8fe5f8c28460082b40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-validate-email \
python3.13dist-validate-email \
python313-validate-email \
python3dist-validate-email"

RDEPENDS:${PN} += "python-abi"

inherit rpm
