SUMMARY = "Devel files of gnulib"
DESCRIPTION = "The GNU portability library is a macro system and C declarations and \
definitions for commonly-used API elements and abstracted system behaviors. \
It can be used to improve portability and other functionality in your programs. \
 \
This package contains devel files of gnulib."
LICENSE = "GPL-2.0-or-later & SUSE-Public-Domain & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-or-later & LGPL-3.0-or-later"

PV = "git.20260114.2a288c048e"

RPM_NAME = "gnulib-devel-git.20260114.2a288c048e-2.7.noarch.rpm"
RPM_HASH = "7fa0e6311e179845390ba09dc046d871198ea1a0822ec83d9d95ec14df2ee51d422aaa5ab7ac4690ac5d4f50e06faf0d0c8f6d29bf486da55db2cb36ed5a3501"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnulib \
gnulib-devel"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/sh \
bison \
coreutils \
diffutils \
gettext-devel \
gperf \
libtool \
make \
patch \
texinfo"

inherit rpm
