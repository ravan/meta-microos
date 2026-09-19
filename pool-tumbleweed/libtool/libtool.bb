SUMMARY = "A Tool to Build Shared Libraries"
DESCRIPTION = "GNU libtool is a set of shell scripts to automatically configure UNIX \
architectures to build shared libraries in a generic fashion."
LICENSE = "GFDL-1.2-or-later & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.6.2"

RPM_NAME = "libtool-2.6.2-1.2.aarch64.rpm"
RPM_HASH = "530e736eafb0536dc7f95dc9968692b8f86bacc08a01b623d6e6aa08ceb4b46309d990e69c059625c16df96257a73f264222cc44caea84c10b122f4d5d3fea2c"

RPROVIDES:${PN} += "libltdl-devel \
libtool \
libtool-ltdl-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
automake \
libltdl7 \
m4 \
tar"

inherit rpm
