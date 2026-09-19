SUMMARY = "A tool for detecting and masking secrets"
DESCRIPTION = "A tool for detecting and masking secrets"
LICENSE = "MIT"

PV = "1.0.0~b4"

RPM_NAME = "python314-microsoft-security-utilities-secret-masker-1.0.0~b4-2.2.noarch.rpm"
RPM_HASH = "085d06b7778dce0dc7aef47e153bd05b1c86be34906995addf74ea98a9b646a36b8509fa4519eeb17e45f8c88a8f0bd70af3f73519f060c09e2d856f874853d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-microsoft-security-utilities-secret-masker \
python314-microsoft-security-utilities-secret-masker \
python3dist-microsoft-security-utilities-secret-masker"

RDEPENDS:${PN} += "python-abi"

inherit rpm
