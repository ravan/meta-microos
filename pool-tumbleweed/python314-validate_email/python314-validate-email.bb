SUMMARY = "Verify if an email address is valid and really exists"
DESCRIPTION = "Validate_email is a package for Python that check if an email is valid, \
properly formatted and really exists."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3"

RPM_NAME = "python314-validate_email-1.3-5.5.noarch.rpm"
RPM_HASH = "5b3662ed994405625f1ef55e8cfc1949106887badd8f2ffc1063732ed275b04d15a5eaea5e5d73bae8b7add7f5ce1b2b0c1b5c8cb50f008becc099833f2d078c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-validate-email \
python314-validate-email \
python3dist-validate-email"

RDEPENDS:${PN} += "python-abi"

inherit rpm
