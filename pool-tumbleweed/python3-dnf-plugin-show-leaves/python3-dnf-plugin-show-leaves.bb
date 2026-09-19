SUMMARY = "Show-leaves Plugin for DNF"
DESCRIPTION = "Show-leaves Plugin for DNF, Python 3 version. List all installed \
packages that are no longer required by any other installed package \
after a transaction."
LICENSE = "GPL-2.0-or-later"

PV = "4.10.1"

RPM_NAME = "python3-dnf-plugin-show-leaves-4.10.1-1.6.noarch.rpm"
RPM_HASH = "bcbc35d9e83f80569467d5782ffbe823ead153bfa2f666679451306971a04521955feb0d64dcaa654ca1ae925a86a6ca9c3beccc94bba4477204373dc9020a41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnf-command-show-leaves \
dnf-plugin-show-leaves \
dnf-plugins-extras-show-leaves \
python3-dnf-plugin-show-leaves \
python3-dnf-plugins-extras-show-leaves"

RDEPENDS:${PN} += "python-abi \
python3-dnf-plugin-leaves \
python3-dnf-plugins-core"

inherit rpm
