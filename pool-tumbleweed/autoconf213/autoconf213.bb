SUMMARY = "A GNU Tool for Automatically Configuring Source Code"
DESCRIPTION = "GNU Autoconf is a tool for configuring source code and makefiles. Using \
autoconf, programmers can create portable and configurable packages, \
because the person building the package is allowed to specify various \
configuration options. \
 \
You should install autoconf if you are developing software and would \
like to create shell scripts to configure your source code packages. \
 \
Note that the autoconf package is not required for the end user who may \
be configuring software with an autoconf-generated script; autoconf is \
only required for the generation of the scripts, not their use."
LICENSE = "GPL-2.0-or-later"

PV = "2.13"

RPM_NAME = "autoconf213-2.13-29.8.noarch.rpm"
RPM_HASH = "8c409fb54f80140dbe1a880b92df188657b907731c07d556c6cad3366ccc246cb46f12c35692e34413795a6f19d3f0434e903856d94661b7e123b79088968d8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "autoconf213"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
gawk \
m4 \
mktemp \
perl"

inherit rpm
