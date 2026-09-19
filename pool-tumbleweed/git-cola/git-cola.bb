SUMMARY = "A GUI for Git"
DESCRIPTION = "git-cola is a graphical user interface for Git that provides a way to \
interact with Git repositories."
LICENSE = "GPL-2.0-or-later"

PV = "4.17.0"

RPM_NAME = "git-cola-4.17.0-1.4.noarch.rpm"
RPM_HASH = "e26d28cd999a9d4dfa99ef011abce85444f3e609343d81d3e447edd675b42236e316a72045bde7f3147c0054287954f82845c60e06e9543a0ff080cc3d1f1a12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-cola \
python3.13dist-git-cola \
python3dist-git-cola"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.13 \
/usr/bin/sh \
git-core \
python-abi \
python3-QtPy \
python3-qt6"

inherit rpm
