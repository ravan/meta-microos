SUMMARY = "A plugin that allows for easy commenting of code for many filetypes"
DESCRIPTION = "The NERD commenter provides many different commenting operations and styles \
which may be invoked via key mappings and a commenting menu. These operations \
are available for most filetypes."
LICENSE = "WTFPL"

PV = "2.7.0"

RPM_NAME = "vim-plugin-NERDcommenter-2.7.0-64.2.noarch.rpm"
RPM_HASH = "0d32cee459946fbd7e79a8e78b8766e13c7e778d3da796a41546aa0bb8e70679561ccdb6bb808ac65b8030c314b95e8d450c3a01d1e8ec170202019f8b0d0515"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-NERDcommenter"

RDEPENDS:${PN} += "/usr/bin/sh \
vim"

inherit rpm
