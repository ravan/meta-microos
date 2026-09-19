SUMMARY = "Conky Configuration File Support for Vim"
DESCRIPTION = "Conky is an configurable system monitor for X. \
 \
This package provides syntax highlighting support for conky \
configuration files in vim."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later & MIT"

PV = "1.24.2"

RPM_NAME = "vim-plugin-conky-1.24.2-1.1.noarch.rpm"
RPM_HASH = "4b2c3772437ea9d5edc6dcfc15b00a84c86d9d2ca26faf3da6b07ae546f1c08726b6cf16fc925a6ca49637cf51872916eef1ed282ce828de86dc1f26fcdf9d68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "conky-vim \
vim-plugin-conky"

RDEPENDS:${PN} += "vim-base"

inherit rpm
