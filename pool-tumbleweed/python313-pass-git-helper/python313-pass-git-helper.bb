SUMMARY = "A git credential helper interfacing with pass"
DESCRIPTION = "A git credential helper interfacing with pass, the standard unix password manager."
LICENSE = "LGPL-3.0-or-later"

PV = "4.1.0"

RPM_NAME = "python313-pass-git-helper-4.1.0-1.4.noarch.rpm"
RPM_HASH = "e80fa012e08595d022e5bd50f9688349a62e90047398766ada9ba901aeab9dafeb20da6a6fab3397a0be349ef14dcbf71d5fd1aa300927a77854302edcb632ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pass-git-helper \
python3.13dist-pass-git-helper \
python313-pass-git-helper \
python3dist-pass-git-helper"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-pyxdg \
update-alternatives"

inherit rpm
