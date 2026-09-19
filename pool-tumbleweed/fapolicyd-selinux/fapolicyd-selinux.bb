SUMMARY = "Fapolicyd selinux"
DESCRIPTION = "The fapolicyd-selinux package contains selinux policy for the fapolicyd daemon."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.3"

RPM_NAME = "fapolicyd-selinux-1.4.3-2.3.noarch.rpm"
RPM_HASH = "dfd0317bfbe0324fcf4fbdec01d1f9cdfeed02e5feac955f171c19135a05ce2ea7cd133a17f56edb312d6dea550481a2684164a949385ca0be7d051b095f3587"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fapolicyd-selinux"

RDEPENDS:${PN} += "/usr/bin/sh \
fapolicyd \
libselinux-utils \
policycoreutils \
policycoreutils-python-utils \
selinux-policy \
selinux-policy-base \
sysuser-shadow"

inherit rpm
