SUMMARY = "Leaves Plugin for DNF"
DESCRIPTION = "Leaves Plugin for DNF, Python 3 version. List all installed packages \
not required by any other installed package."
LICENSE = "GPL-2.0-or-later"

PV = "4.10.1"

RPM_NAME = "python3-dnf-plugin-leaves-4.10.1-1.6.noarch.rpm"
RPM_HASH = "acd017c573f608856ae768f9335b04ebbade1125fcf1bea94fcffc0e41b1e82ca1f374040befd048c77fec7a289ebf33b2c97bf7ad62c3e2c5909049bbe6dcff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnf-command-leaves \
dnf-plugin-leaves \
dnf-plugins-extras-leaves \
python3-dnf-plugin-leaves \
python3-dnf-plugins-extras-leaves"

RDEPENDS:${PN} += "python-abi \
python3-dnf-plugins-core"

inherit rpm
