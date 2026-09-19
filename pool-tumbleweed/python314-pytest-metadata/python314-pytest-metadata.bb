SUMMARY = "Pytest plugin for test session metadata"
DESCRIPTION = "Pytest plugin for test session metadata."
LICENSE = "MPL-2.0"

PV = "3.1.1"

RPM_NAME = "python314-pytest-metadata-3.1.1-1.11.noarch.rpm"
RPM_HASH = "45e528d30f8f7b417a8ba550415085114486a9a431d54e8cf1a3eafe3e470ffaf85fa144a60c1381fb38197fb4cb82ff75f7305d357f04cd2ade08a6da342bdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-metadata \
python314-pytest-metadata \
python3dist-pytest-metadata"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
