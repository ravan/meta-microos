SUMMARY = "Quilt support for vim"
DESCRIPTION = "Vim plugin that helps with quilt operations from inside vim."
LICENSE = "GPL-2.0-only"

PV = "0.9.7"

RPM_NAME = "vim-plugin-quilt-0.9.7-64.2.noarch.rpm"
RPM_HASH = "95ef68d39ae968719f1d2e05da5ec0245598838d70d9b78243791da50c1436896f7d7296c86b2ab11a776f2fcc96ebab654a12132ca5d4c5ca4b1f49edfe1b66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-quilt"

RDEPENDS:${PN} += "/usr/bin/sh \
quilt \
vim"

inherit rpm
