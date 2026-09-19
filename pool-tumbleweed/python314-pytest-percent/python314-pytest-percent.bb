SUMMARY = "Pytest plugin to exit successfully when a required percent of tests pass"
DESCRIPTION = "Change the exit code of pytest test sessions when a required percent of tests pass."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python314-pytest-percent-0.1.2-2.5.noarch.rpm"
RPM_HASH = "539538d3397a7e6590bece7d2b381ef738b268fc415aea4074aca4fab36c16602ba8446b290924f9e748df58e1ee8c2f74c5682e0428840c13d31c8dbf673de1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-percent \
python314-pytest-percent \
python3dist-pytest-percent"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
