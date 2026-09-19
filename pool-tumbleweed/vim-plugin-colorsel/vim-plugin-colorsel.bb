SUMMARY = "A RGB/HSV color selector"
DESCRIPTION = "A simple interactive RGB/HSV color selector modelled after Gimp2 RGB/HSV color \
selector."
LICENSE = "SUSE-Public-Domain"

PV = "20110107"

RPM_NAME = "vim-plugin-colorsel-20110107-64.2.noarch.rpm"
RPM_HASH = "bf5b491121f22fce0ab7c0bafa7363c93c26bbc3c5d9f487ab71ab7a25d6305f895b5947118e027315c3c0c55136cd010663d99b021d49e175d8f148f86f01aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-colorsel"

RDEPENDS:${PN} += "/usr/bin/sh \
gvim \
vim"

inherit rpm
