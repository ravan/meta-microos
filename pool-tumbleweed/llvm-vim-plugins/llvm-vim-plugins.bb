SUMMARY = "Vim plugins for LLVM"
DESCRIPTION = "This package contains vim plugins for LLVM like syntax highlighting. \
 \
This package is a dummy package that depends on the version of \
llvm-vim-plugins that openSUSE currently supports.  Packages that \
don't require a specific LLVM version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "23"

RPM_NAME = "llvm-vim-plugins-23-1.1.noarch.rpm"
RPM_HASH = "77edc669f5fb2722af4ad0e715c8d1528242be02a217cda376b103877ba2ab407dec411869e7517ac630eb4d4c2d48d88658dee52c3b4e1bfda90e1e9bc7e7a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm-vim-plugins"

RDEPENDS:${PN} += "llvm23-vim-plugins"

inherit rpm
