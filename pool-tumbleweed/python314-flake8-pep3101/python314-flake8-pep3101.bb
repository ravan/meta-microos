SUMMARY = "Checks for old string formatting"
DESCRIPTION = "Checks for old string formatting."
LICENSE = "GPL-2.0-only"

PV = "3.0.0"

RPM_NAME = "python314-flake8-pep3101-3.0.0-1.5.noarch.rpm"
RPM_HASH = "374499e6cc7572339f4ea7d98e5a83373bf150f1fbf7414d9a2cc76a486037eba44792f43b5b29499fda69d604f46ea68c22ed39d0fd58a0164579a300648e52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flake8-pep3101 \
python314-flake8-pep3101 \
python3dist-flake8-pep3101"

RDEPENDS:${PN} += "python-abi \
python314-flake8"

inherit rpm
