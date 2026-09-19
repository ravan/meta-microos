SUMMARY = "RpmConf Plugin for DNF"
DESCRIPTION = "RpmConf Plugin for DNF, Python 3 version. Handles .rpmnew, .rpmsave every \
transaction."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.2"

RPM_NAME = "python3-dnf-plugin-rpmconf-4.1.2-1.8.noarch.rpm"
RPM_HASH = "52ec72cf4eaec2aa09ccfd4b4eb29f948ee9e2776fc75cf7cb8a834fcb949a4059a6feb46a963c4482dec88ce774a5ec734a2b5ba09f6ba75b6eab3758e0cdd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-python3-dnf-plugin-rpmconf \
dnf-plugin-rpmconf \
dnf-plugins-extras-rpmconf \
python3-dnf-plugin-rpmconf \
python3-dnf-plugins-extras-rpmconf \
yum-merge-conf"

RDEPENDS:${PN} += "python-abi \
python3-dnf-plugins-extras-common \
python3-rpmconf"

inherit rpm
