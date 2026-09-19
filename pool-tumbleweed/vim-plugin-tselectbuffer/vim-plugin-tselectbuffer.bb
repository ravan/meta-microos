SUMMARY = "A quick buffer selector/switcher"
DESCRIPTION = "This plugin provides a simple buffer selector. It doesn't have all the features \
other buffer selectors have but can be useful for quickly switching to a \
different buffer or for deleting buffers."
LICENSE = "GPL-1.0-or-later"

PV = "0.7"

RPM_NAME = "vim-plugin-tselectbuffer-0.7-64.2.noarch.rpm"
RPM_HASH = "a05806f8e9c45bad58929e99984b91f87b197a3e6bc18dfbb4225e110126ad1c55ed752046a283d54df00b656aa9bd5df52ef002fac19fdffd9d5c655407f6a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-tselectbuffer"

RDEPENDS:${PN} += "/usr/bin/sh \
vim"

inherit rpm
