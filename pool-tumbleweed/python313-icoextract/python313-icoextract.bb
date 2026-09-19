SUMMARY = "Extract icons from Windows PE files (.exe/.dll)"
DESCRIPTION = "icoextract is an icon extractor for Windows PE files (.exe/.dll), written in \
Python. It also includes a thumbnailer script (exe-thumbnailer) for Linux \
desktops."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python313-icoextract-0.2.0-1.4.noarch.rpm"
RPM_HASH = "91ee7a6bf8217fdcff989bd6c3837bb05a0774f44ae4ef5aeba12e8a490fa4b2bcb7ab079e344044c32f6acbc2ea25b6b35f4c8f0ca8088d46bcb9246f18a47d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-icoextract \
python3.13dist-icoextract \
python313-icoextract \
python3dist-icoextract"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-pefile \
update-alternatives"

inherit rpm
