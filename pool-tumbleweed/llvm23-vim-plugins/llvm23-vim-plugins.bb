SUMMARY = "Vim plugins for LLVM"
DESCRIPTION = "This package contains vim plugins for LLVM like syntax highlighting."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "23.1.1"

RPM_NAME = "llvm23-vim-plugins-23.1.1-1.1.noarch.rpm"
RPM_HASH = "8be9096c1c8165bc2384e3cb1ba093e0ccc0a1f3c5b0c4b0a7aa01a1af772c372174d4fa8160c97dcac90de473d17f5927f1ecbe6248730e2c3bce6acd4a3d06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm23-vim-plugins \
vim-plugin-llvm"

RDEPENDS:${PN} += ""

inherit rpm
