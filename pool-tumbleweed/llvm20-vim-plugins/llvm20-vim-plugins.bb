SUMMARY = "Vim plugins for LLVM"
DESCRIPTION = "This package contains vim plugins for LLVM like syntax highlighting."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "20.1.8"

RPM_NAME = "llvm20-vim-plugins-20.1.8-8.2.noarch.rpm"
RPM_HASH = "a41f682571a2bde6714534e87ee572f88c2b015bd541cfb8c11367ca373389ad4f4780fcb77c5349100644c1622cf4a9cd19f83419a4f76a0ab73a160ba82d05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm20-vim-plugins \
vim-plugin-llvm"

RDEPENDS:${PN} += ""

inherit rpm
