SUMMARY = "Python 2 / 3 compatibility, like six, but favouring Python 3"
DESCRIPTION = "python-nine is python-six 'turned around': whereas python-six used \
to make python2 idioms work in python3, python-nine makes python3 \
idioms work in python2."
LICENSE = "SUSE-Public-Domain"

PV = "1.2.0"

RPM_NAME = "python313-nine-1.2.0-2.4.noarch.rpm"
RPM_HASH = "a1955028006bdad3f86c299320d25aebb0ffea60d4b6ed6b05056b3b0b2bbbbccd97b6c8ad8750f85e2d8d13dd8039eb40457bfdf0e39731483991a922f6b69a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nine \
python3.13dist-nine \
python313-nine \
python3dist-nine"

RDEPENDS:${PN} += "python-abi"

inherit rpm
