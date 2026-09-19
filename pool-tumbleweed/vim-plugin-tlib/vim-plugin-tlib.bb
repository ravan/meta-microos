SUMMARY = "Utility functions for vim"
DESCRIPTION = "This library provides some utility functions. There isn't much need to install \
it unless another plugin requires you to do so."
LICENSE = "GPL-1.0-or-later"

PV = "1.28"

RPM_NAME = "vim-plugin-tlib-1.28-64.2.noarch.rpm"
RPM_HASH = "76f926f91483334320aebdcc7f41299f99a6755e566a6c6649185e7264e261058982eddfe1a4e9077e4c64e723c5c76699bac2622a45930263becd703f7181cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-tlib"

RDEPENDS:${PN} += "/usr/bin/sh \
vim"

inherit rpm
