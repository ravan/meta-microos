SUMMARY = "Hatch plugin for versioning with your preferred VCS"
DESCRIPTION = "This provides a plugin for Hatch that uses your preferred version control system (like Git) to determine project versions."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python313-hatch_vcs-0.5.0-2.7.noarch.rpm"
RPM_HASH = "7f5289aa2b3f4f026a77192c4f43661317af47d607b968341154cee9f58e1273e7167c5334d271440c1a9e16a9c5ed5647867dd4703eb2eff450e00fb1984327"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hatch-vcs \
python3.13dist-hatch-vcs \
python313-hatch-vcs \
python3dist-hatch-vcs"

RDEPENDS:${PN} += "python-abi \
python313-hatchling \
python313-setuptools-scm"

inherit rpm
