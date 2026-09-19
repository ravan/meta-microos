SUMMARY = "Yum-utils CLI compatibility layer"
DESCRIPTION = "As a Yum-utils CLI compatibility layer, supplies in CLI shims for \
debuginfo-install, groups-manager, repograph, package-cleanup, repoclosure, \
repomanage, repoquery, reposync, repotrack, builddep, config-manager, debug, \
and download that use new implementations using DNF."
LICENSE = "GPL-2.0-or-later"

PV = "4.10.1"

RPM_NAME = "yum-utils-4.10.1-1.6.noarch.rpm"
RPM_HASH = "0e0986e0212ae0ff8956c8a62e30903d2aa1695212c5da50b659b09b471f9d143ce9501c62d7e1244c8fb50b84ab495595720bb10ce4fb97efbdbadec43f98f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnf-utils \
yum-changelog \
yum-utils"

RDEPENDS:${PN} += "/usr/bin/python3 \
dnf \
dnf-plugins-core \
python3-dnf"

inherit rpm
