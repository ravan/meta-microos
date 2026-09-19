SUMMARY = "A minimalist production ready plugin system"
DESCRIPTION = "This is the core framework used by the pytest, tox, and devpi projects."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python311-pluggy-1.6.0-2.7.noarch.rpm"
RPM_HASH = "19e8c885733442c1b91d6fdd51b71f5efcc90c6cac5f60e8d5648a9f10d57faf7ff08ac7b7276a4cd460a603535ce317bc9806872b965f1573a8a7645241c076"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pluggy \
python311-pluggy \
python3dist-pluggy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
