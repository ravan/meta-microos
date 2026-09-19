SUMMARY = "A git credential helper interfacing with pass"
DESCRIPTION = "A git credential helper interfacing with pass, the standard unix password manager."
LICENSE = "LGPL-3.0-or-later"

PV = "4.1.0"

RPM_NAME = "python314-pass-git-helper-4.1.0-1.4.noarch.rpm"
RPM_HASH = "95d51469223ed9b1b85b40447c53b44aff80cbbfb135f10d4afa9c70fa3c7742fc01bd88c074c3672142c84d400356d0d82a8c4cb744e378146500e6f278a32e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pass-git-helper \
python314-pass-git-helper \
python3dist-pass-git-helper"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-pyxdg \
update-alternatives"

inherit rpm
