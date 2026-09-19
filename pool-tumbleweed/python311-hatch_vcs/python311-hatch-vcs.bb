SUMMARY = "Hatch plugin for versioning with your preferred VCS"
DESCRIPTION = "This provides a plugin for Hatch that uses your preferred version control system (like Git) to determine project versions."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python311-hatch_vcs-0.5.0-2.7.noarch.rpm"
RPM_HASH = "844fefd292ec4b4a372a197677c41e2f1084e70e60c70c5372d44c8c0718a7582a5ed374ef5572750cdc9322cfe4b65a9b9b099a1cb100391a3ef977375bc38d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-hatch-vcs \
python311-hatch-vcs \
python3dist-hatch-vcs"

RDEPENDS:${PN} += "python-abi \
python311-hatchling \
python311-setuptools-scm"

inherit rpm
