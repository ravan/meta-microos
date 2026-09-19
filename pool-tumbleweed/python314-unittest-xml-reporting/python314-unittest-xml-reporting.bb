SUMMARY = "PyUnit-based test runner with JUnit like XML reporting"
DESCRIPTION = "unittest-xml-reporting is a unittest test runner that can save test results \
to XML files that can be consumed by a wide range of tools, such as build \
systems, IDEs and continuous integration servers."
LICENSE = "LGPL-3.0-or-later"

PV = "4.0.0"

RPM_NAME = "python314-unittest-xml-reporting-4.0.0-1.5.noarch.rpm"
RPM_HASH = "ca341d81e4a15e4de57e746dfc160d07999e3de3aa92d272e2544d9e33a321cf6ede3987ad64a1cc651d77dbc1073cbf3fde512e51e19f5ff80e1445ea8b641e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-unittest-xml-reporting \
python314-unittest-xml-reporting \
python314-xmlrunner \
python3dist-unittest-xml-reporting"

RDEPENDS:${PN} += "python-abi \
python314-lxml"

inherit rpm
