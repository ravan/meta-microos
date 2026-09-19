SUMMARY = "Development files for the readline library version 5"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "5.2"

RPM_NAME = "readline5-devel-5.2-141.11.aarch64.rpm"
RPM_HASH = "bec2c294807c318f62e79f9cde38c4a3f9d61097209f1440a78dab9cd696fc1685b2bbafc67ca35e069cf7955ae8c2c01f698055760a10a2dbf915fce5c4d95e"

RPROVIDES:${PN} += "bash-/usr/lib64/libreadline.a \
readline5-devel"

RDEPENDS:${PN} += "libreadline5 \
ncurses-devel"

inherit rpm
