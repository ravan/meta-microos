SUMMARY = "Extract icons from Windows PE files (.exe/.dll)"
DESCRIPTION = "icoextract is an icon extractor for Windows PE files (.exe/.dll), written in \
Python. It also includes a thumbnailer script (exe-thumbnailer) for Linux \
desktops."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python314-icoextract-0.2.0-1.4.noarch.rpm"
RPM_HASH = "df8d6f1d7a39921824a0a0e69ba86d7d69f0d29bf132909c1dc1f39291bec68bdcb39dd5b3bff5094e2bdad93003005713c4faa2d3e919d70e3ac73094b88a48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-icoextract \
python314-icoextract \
python3dist-icoextract"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-pefile \
update-alternatives"

inherit rpm
