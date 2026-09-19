SUMMARY = "PyUnit-based test runner with JUnit like XML reporting"
DESCRIPTION = "unittest-xml-reporting is a unittest test runner that can save test results \
to XML files that can be consumed by a wide range of tools, such as build \
systems, IDEs and continuous integration servers."
LICENSE = "LGPL-3.0-or-later"

PV = "4.0.0"

RPM_NAME = "python313-unittest-xml-reporting-4.0.0-1.5.noarch.rpm"
RPM_HASH = "3d1325b3dbec97673e98ef34a44adf08ea96fedef15a958beece11edd0428bec3c2d388446d50dcceb813308b54a44b85cb087bdec0ea4b36700fa89e2372602"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-unittest-xml-reporting \
python3-xmlrunner \
python3.13dist-unittest-xml-reporting \
python313-unittest-xml-reporting \
python313-xmlrunner \
python3dist-unittest-xml-reporting"

RDEPENDS:${PN} += "python-abi \
python313-lxml"

inherit rpm
