SUMMARY = "Run the ack search tool from Vim"
DESCRIPTION = "Run the ack search tool from Vim, with enhanced results listing."
LICENSE = "Vim"

PV = "1.0.9"

RPM_NAME = "vim-plugin-ack-1.0.9-64.2.noarch.rpm"
RPM_HASH = "73469f1d37d1c2d5e69fa1e3f934272cd3662ec5e97342dec568c89dc8ee6e9e6d580ec51ec8097114ff262266dd3f5a25bd0fa4381582cc5777da1ffd8bcb0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-ack \
vim-plugin-ag"

RDEPENDS:${PN} += "/usr/bin/sh \
ack"

inherit rpm
