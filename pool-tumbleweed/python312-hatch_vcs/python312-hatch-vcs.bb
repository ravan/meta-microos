SUMMARY = "Hatch plugin for versioning with your preferred VCS"
DESCRIPTION = "This provides a plugin for Hatch that uses your preferred version control system (like Git) to determine project versions."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python312-hatch_vcs-0.5.0-2.7.noarch.rpm"
RPM_HASH = "1e0ef5765ddbedd370d7f444a08784b03289e45872ac1714e86a3c3c4994d184ae13c6689ae0b09884c3b029d98a05107031a963f58347f2ba727077db4cba15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-hatch-vcs \
python312-hatch-vcs \
python3dist-hatch-vcs"

RDEPENDS:${PN} += "python-abi \
python312-hatchling \
python312-setuptools-scm"

inherit rpm
