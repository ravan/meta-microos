SUMMARY = "Development files for the readline library version 6"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-3.0-or-later"

PV = "6.3"

RPM_NAME = "readline6-devel-6.3-6.5.aarch64.rpm"
RPM_HASH = "09b0507ead48fec0184d0e5eb03d7b12e00e0412e314f1e6d6dfd6b219b1a4c8a46385ac4e4659348dd8882853a641b49e7d10c562842739b80791c45e5d9b25"

RPROVIDES:${PN} += "bash-/usr/lib64/libreadline.a \
readline6-devel"

RDEPENDS:${PN} += "libreadline6 \
ncurses-devel"

inherit rpm
