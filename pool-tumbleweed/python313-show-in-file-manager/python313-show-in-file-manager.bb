SUMMARY = "Open the system file manager and select files in it"
DESCRIPTION = "Show in File Manager is a Python package to open the system file manager \
and optionally select files in it. The point is not to open the files, but \
to select them in the file manager, thereby highlighting the files and allowing \
the user to quickly do something with them."
LICENSE = "MIT"

PV = "1.1.6"

RPM_NAME = "python313-show-in-file-manager-1.1.6-1.3.noarch.rpm"
RPM_HASH = "5b67d50b91556a35bad9f689a45fee2ef63c3b9450b311ae5f71acb323a0469c45e64a2b5a3790d1ba019c5328a4a7de5f7f7cda22cfaaf3392521b8092578b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-show-in-file-manager \
python3.13dist-show-in-file-manager \
python313-show-in-file-manager \
python3dist-show-in-file-manager"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-packaging \
python313-pyxdg \
update-alternatives"

inherit rpm
