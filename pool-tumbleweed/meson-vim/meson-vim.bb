SUMMARY = "Vim syntax highlighting support for meson.build files"
DESCRIPTION = "Meson is a build system designed to optimise programmer productivity. \
It aims to do this by providing support for software development \
tools and practices, such as unit tests, coverage reports, Valgrind, \
CCache and the like. Supported languages include C, C++, Fortran, \
Java, Rust. Build definitions are written in a non-turing complete \
Domain Specific Language. \
 \
This package provides meson.build syntax highlighting support for \
Vim/NeoVim."
LICENSE = "Apache-2.0"

PV = "1.12.0"

RPM_NAME = "meson-vim-1.12.0-2.1.noarch.rpm"
RPM_HASH = "6b851e19cee0de39bddc08e35979b2cbd4e5dd9d35e1b728444e53ecad7460cc1cdecd6baf4449c087fc614b606e0eceb3d52a0850803559c42468a80b9f59d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "meson-vim"

RDEPENDS:${PN} += "vim"

inherit rpm
