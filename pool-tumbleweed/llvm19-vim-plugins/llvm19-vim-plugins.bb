SUMMARY = "Vim plugins for LLVM"
DESCRIPTION = "This package contains vim plugins for LLVM like syntax highlighting."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "19.1.7"

RPM_NAME = "llvm19-vim-plugins-19.1.7-14.3.noarch.rpm"
RPM_HASH = "1b7b9ff0cbc60cc795476416f90e0a0ea06eb7d9ad974ed6b233a64151794db0bf05dd1033ff7614aeb13b368898a75274d64841af57e24d5fc043178a358a39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm19-vim-plugins \
vim-plugin-llvm"

RDEPENDS:${PN} += ""

inherit rpm
