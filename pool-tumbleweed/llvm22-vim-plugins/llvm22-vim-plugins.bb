SUMMARY = "Vim plugins for LLVM"
DESCRIPTION = "This package contains vim plugins for LLVM like syntax highlighting."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "22.1.8"

RPM_NAME = "llvm22-vim-plugins-22.1.8-3.2.noarch.rpm"
RPM_HASH = "91c66c55274fec7ede2b6961df9c7e4c703ac6ce234726a6a1b733dfae349c8e28b40aa8453a733ce6f9cdec991fa17d6c3877d38d81f898dc6a57a9d5432459"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm22-vim-plugins \
vim-plugin-llvm"

RDEPENDS:${PN} += ""

inherit rpm
