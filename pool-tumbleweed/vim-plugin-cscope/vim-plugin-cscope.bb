SUMMARY = "Keyboard mappings for cscope"
DESCRIPTION = "Boilerplate settings for vim's cscope interface, plus some keyboard mappings."
LICENSE = "BSD-3-Clause"

PV = "1"

RPM_NAME = "vim-plugin-cscope-1-64.2.noarch.rpm"
RPM_HASH = "58cf7bb86cb327e0c4bdccda28ea736850e25b71db65b14ec13463bfa6b3f85a3a7cbfa070bf22315e60a976ff7bfca23e633155fec8049d9c3c03fd8ae39133"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-cscope"

RDEPENDS:${PN} += "vim"

inherit rpm
