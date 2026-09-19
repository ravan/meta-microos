SUMMARY = "Git log and patch viewer and fuzzy searcher"
DESCRIPTION = "Git log and patch viewer and fuzzy searcher. \
This command provides a two column view with the left column containing the list of commits \
and the right column showing the currently selected commit."
LICENSE = "AGPL-3.0-or-later"

PV = "20230725.997a813"

RPM_NAME = "git-fzlog-20230725.997a813-1.9.noarch.rpm"
RPM_HASH = "746e9789c6712069f0349b3acae66e4e7cab1dd63c89dd24b84bb860e81998f7c7340c383b75a772e7a03faa3bb23f115fb568ddd89d53cd59a33bf760a4dec5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-fzlog"

RDEPENDS:${PN} += "/usr/bin/sh \
bash \
bat \
fzf \
git"

inherit rpm
