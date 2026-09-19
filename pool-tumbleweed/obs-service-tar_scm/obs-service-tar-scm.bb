SUMMARY = "An OBS source service: create tar ball from svn/git/hg"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
It supports downloading from svn, git and hg repositories."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.4"

RPM_NAME = "obs-service-tar_scm-0.12.4-1.1.noarch.rpm"
RPM_HASH = "bb3c797cd9997125f08712e9ddc56f4da4be3b31cf79eeee99d38080ca78c5613dcb97bff5b26cd8c6a223c617ebc58f5013394268440c38f874b2c6e10ed4ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-tar-scm"

RDEPENDS:${PN} += "/usr/bin/python3 \
git-core \
obs-service-obs-scm-common"

inherit rpm
