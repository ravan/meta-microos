SUMMARY = "Open the system file manager and select files in it"
DESCRIPTION = "Show in File Manager is a Python package to open the system file manager \
and optionally select files in it. The point is not to open the files, but \
to select them in the file manager, thereby highlighting the files and allowing \
the user to quickly do something with them."
LICENSE = "MIT"

PV = "1.1.6"

RPM_NAME = "python314-show-in-file-manager-1.1.6-1.3.noarch.rpm"
RPM_HASH = "21fbcc9a7a219da9dca26a337b6d334e8966e7a02ff9f244f2aa54d5d90a007f968753056b31574169535b725d5afebf0568b6795917daa3ef659893cf5777c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-show-in-file-manager \
python314-show-in-file-manager \
python3dist-show-in-file-manager"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-packaging \
python314-pyxdg \
update-alternatives"

inherit rpm
