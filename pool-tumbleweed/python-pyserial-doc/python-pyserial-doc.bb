SUMMARY = "Documentation for python-pyserial"
DESCRIPTION = "Documentation, examples, and help files for python-pyserial."
LICENSE = "Python-2.0"

PV = "3.5"

RPM_NAME = "python-pyserial-doc-3.5-7.5.noarch.rpm"
RPM_HASH = "7f2e3621f12eb6fb342b19a4614518ff78955ce4d3ee4a338bbe9c58419e408dcda1624febdcdd193bf27e0809fbea517ab1c6ef416966ff8a73c157e5d05db9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pyserial-doc \
python2-pyserial-doc \
python3-pyserial-doc"

RDEPENDS:${PN} += ""

inherit rpm
