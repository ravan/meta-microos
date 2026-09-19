SUMMARY = "A plugin for snapshot testing with pytest"
DESCRIPTION = "A plugin for snapshot testing with pytest."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python314-pytest-snapshot-0.9.0-1.6.noarch.rpm"
RPM_HASH = "836d5542b02bb1b808d514e15939d3c42170ad897b8b16e5501de4482f7728ea06ff8c3500db3ebb7d7fabd596273b2e424985ae9d73fc4f41534789342d5644"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-snapshot \
python314-pytest-snapshot \
python3dist-pytest-snapshot"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
