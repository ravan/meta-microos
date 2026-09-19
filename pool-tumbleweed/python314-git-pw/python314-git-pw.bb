SUMMARY = "A tool for integrating Git with Patchwork"
DESCRIPTION = "git-pw is a tool for integrating Git with Patchwork, the web-based patch \
tracking system."
LICENSE = "MIT"

PV = "2.8.1"

RPM_NAME = "python314-git-pw-2.8.1-1.2.noarch.rpm"
RPM_HASH = "0e3bcf84b094cd37497e428e909653e7316fcbc90c827f03994f37ce1927281fc3a1caf16d71e63daab83c113d3abd864f7fcf3c119bd40f7e0b0b91f863282c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-pw \
python3.14dist-git-pw \
python314-git-pw \
python3dist-git-pw"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
git-core \
python-abi \
python314-PyYAML \
python314-arrow \
python314-click \
python314-requests \
python314-tabulate \
update-alternatives"

inherit rpm
