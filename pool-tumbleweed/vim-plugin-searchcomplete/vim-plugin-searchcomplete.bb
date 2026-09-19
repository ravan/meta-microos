SUMMARY = "Tab completion of words inside of a search"
DESCRIPTION = "This plugin allows to tab-complete words while typing in a \
search ('/')."
LICENSE = "GPL-2.0-only"

PV = "1.1"

RPM_NAME = "vim-plugin-searchcomplete-1.1-64.2.noarch.rpm"
RPM_HASH = "279705de8c26158613071749080869052c893d584445b587ef6ddb98d4a0ba0ecc064f77d448b540368a0d0978f0029da0ece032a9afa21274125eca5be5f826"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-searchcomplete"

RDEPENDS:${PN} += "vim"

inherit rpm
