SUMMARY = "Mercurial tests"
DESCRIPTION = "Mercurial is a fast, lightweight source control management system \
designed for efficient handling of very large distributed projects. \
 \
This package contains its tests."
LICENSE = "GPL-2.0-or-later"

PV = "7.2.4"

RPM_NAME = "mercurial-tests-7.2.4-1.2.noarch.rpm"
RPM_HASH = "98a72157eddffcb9db945a805b5ac49097c0f9a7f969abc2cc3b1399c01c9e9a688196b67f2d34b969f2b7209fd623a9981f0cfd0489b063169298dd44854ca3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mercurial-tests"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh \
mercurial"

inherit rpm
