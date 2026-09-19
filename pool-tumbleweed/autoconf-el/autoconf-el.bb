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
LICENSE = "GPL-3.0-or-later"

PV = "2.73"

RPM_NAME = "autoconf-el-2.73-1.2.noarch.rpm"
RPM_HASH = "d5f070fb7b3cbdc1874b9eb8932413a74af05f51f580ffe4b79314d106cc729eed7134c65401d9c9d42db9884913835851392751a267f31225959d02a2690c7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "autoconf-el"

RDEPENDS:${PN} += ""

inherit rpm
