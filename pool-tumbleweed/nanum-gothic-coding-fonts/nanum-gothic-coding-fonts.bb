SUMMARY = "Nanum Gothic Coding Korean TrueType Fonts"
DESCRIPTION = "Collection of Nanum Gothic Coding Korean TrueType fonts."
LICENSE = "OFL-1.1"

PV = "2.0"

RPM_NAME = "nanum-gothic-coding-fonts-2.0-23.34.noarch.rpm"
RPM_HASH = "28123e05d63d257f366894c065b6f0fd215b68eebf4c4ac8cee9c2fac89d5dfda5e938df6db524f03eb68cf54ab01908f2774971fd24b936f2183c0ec913d503"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nanum-gothic-coding \
nanum-gothic-coding-fonts"

RDEPENDS:${PN} += ""

inherit rpm
