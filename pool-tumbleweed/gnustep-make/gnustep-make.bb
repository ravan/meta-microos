SUMMARY = "GNUstep Makefile package"
DESCRIPTION = "This package contains the basic scripts, makefiles and directory \
layout needed to run and compile any GNUstep software. This package \
was configured for the FHS file system layout, customised for SUSE."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "2.9.3"

RPM_NAME = "gnustep-make-2.9.3-1.5.aarch64.rpm"
RPM_HASH = "6ff1880ad0472e5e92fffbad6603876b5f75a69844151958494e2522b28c87d10fc6eddfd9c01538f03d43d48258ba5f9c6cecdaad7d3634bbce0f3a2ac819fd"

RPROVIDES:${PN} += "config-gnustep-make \
gnustep-make"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/bash \
/usr/bin/sh"

inherit rpm
