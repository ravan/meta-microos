SUMMARY = "Hatch plugin for versioning with your preferred VCS"
DESCRIPTION = "This provides a plugin for Hatch that uses your preferred version control system (like Git) to determine project versions."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python314-hatch_vcs-0.5.0-2.7.noarch.rpm"
RPM_HASH = "0d5d839770f8be6b2068e389aa793b9e1e44c9a10d395935b6f51871c15476fe50a4189ed9a3c11382d9d1a25cf5f977729fc6d3cbcef7678795cb720143f689"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hatch-vcs \
python314-hatch-vcs \
python3dist-hatch-vcs"

RDEPENDS:${PN} += "python-abi \
python314-hatchling \
python314-setuptools-scm"

inherit rpm
