SUMMARY = "Vim plugins for LLVM"
DESCRIPTION = "This package contains vim plugins for LLVM like syntax highlighting."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "21.1.8"

RPM_NAME = "llvm21-vim-plugins-21.1.8-9.2.noarch.rpm"
RPM_HASH = "a9ff804ca4caf14fc273873fde7e2100671c0f246f82ac75748271f62cddfbf01cfb8a52237176230266adfe101c28bde88120edc6f0177234e1867eeed70dd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm21-vim-plugins \
vim-plugin-llvm"

RDEPENDS:${PN} += ""

inherit rpm
