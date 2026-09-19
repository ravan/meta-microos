SUMMARY = "Keyboard-driven vim-like browser based on Qt6"
DESCRIPTION = "qutebrowser is a keyboard-focused browser with a minimal GUI. \
It's based on PyQt6 and QtWebEngine."
LICENSE = "GPL-3.0-or-later"

PV = "3.7.0"

RPM_NAME = "qutebrowser-3.7.0-1.2.noarch.rpm"
RPM_HASH = "87e8684735839e08b3e0aa5945a9b14de88bd3a278555dc0081aa3f821b727f1f4b8ce5e7eace0aa5b00a112c41ffd3ef5f1ba81838786a1718aeaa365e84949"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-qutebrowser \
python3dist-qutebrowser \
qutebrowser \
qutebrowser-git-qt6"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/node \
/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-Jinja2 \
python3-MarkupSafe \
python3-PyQt6-WebEngine \
python3-PyYAML \
python3-opengl \
qt6-sql-sqlite"

inherit rpm
