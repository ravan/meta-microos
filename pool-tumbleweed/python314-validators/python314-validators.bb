SUMMARY = "Python Data Validation"
DESCRIPTION = "Python Data Validation for Humans."
LICENSE = "MIT"

PV = "0.35.0"

RPM_NAME = "python314-validators-0.35.0-1.5.noarch.rpm"
RPM_HASH = "6017d42eb67147ab41ae161f93eb6dd5be398e3c29d0c3b384664af6857597cda262284bb8756af79f599b94965b3f622fa06ae141099d023ac48e325a3e5f39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-validators \
python314-validators \
python3dist-validators"

RDEPENDS:${PN} += "python-abi"

inherit rpm
