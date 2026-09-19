SUMMARY = "Vim plugins for LLVM"
DESCRIPTION = "This package contains vim plugins for LLVM like syntax highlighting."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "18.1.8"

RPM_NAME = "llvm18-vim-plugins-18.1.8-13.1.noarch.rpm"
RPM_HASH = "930784e26a28a07c25c76ae7b36dfcb9faf97819055c9104fd64098981ed00fffe0ee6f3bbd3c0c8dee2a42d1498c12ff72bfe3185fb88a6384a73e83327b5c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm18-vim-plugins \
vim-plugin-llvm"

RDEPENDS:${PN} += ""

inherit rpm
