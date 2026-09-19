SUMMARY = "A dark stylesheet for Python and Qt applications"
DESCRIPTION = "QDarkStyle is a dark stylesheet for Python and Qt applications."
LICENSE = "MIT"

PV = "3.2.3"

RPM_NAME = "python313-QDarkStyle-3.2.3-1.2.noarch.rpm"
RPM_HASH = "4d15c99db6433e3c500f7289e8a011989090122d25c07fe510dd906f35c00b348b719827527c0642e83c113095a1fffc10c7901aa45cfc4a3739452ebfe1efee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-QDarkStyle \
python3.13dist-qdarkstyle \
python313-QDarkStyle \
python3dist-qdarkstyle"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-QtPy"

inherit rpm
