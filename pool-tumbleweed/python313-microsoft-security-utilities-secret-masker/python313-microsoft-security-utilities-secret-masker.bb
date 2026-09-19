SUMMARY = "A tool for detecting and masking secrets"
DESCRIPTION = "A tool for detecting and masking secrets"
LICENSE = "MIT"

PV = "1.0.0~b4"

RPM_NAME = "python313-microsoft-security-utilities-secret-masker-1.0.0~b4-2.2.noarch.rpm"
RPM_HASH = "abc698f4e5d9e765434afa2739681eb9e029804b6ce42c6cb452898e6cee994909e1a299ed96946d2f0e9a845856bf79a6b9fba95bb2b53aa2339042948f22b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-microsoft-security-utilities-secret-masker \
python3.13dist-microsoft-security-utilities-secret-masker \
python313-microsoft-security-utilities-secret-masker \
python3dist-microsoft-security-utilities-secret-masker"

RDEPENDS:${PN} += "python-abi"

inherit rpm
