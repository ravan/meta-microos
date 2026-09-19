SUMMARY = "Display multiple searches at the same time"
DESCRIPTION = "MultipleSearch allows you to have the results of multiple searches displayed \
on the screen at the same time.  Each search highlights its results in a \
different color, and all searches are displayed at once.  After the maximum \
number of colors is used, the script starts over with the first color."
LICENSE = "Vim"

PV = "1.3"

RPM_NAME = "vim-plugin-multiplesearch-1.3-64.2.noarch.rpm"
RPM_HASH = "68419d474c769bed7a7f4e0e9e62c64cdd3f6bef2f40122a572d2596a34d09b872a8fb3924761316590945ca5d512e814230e42706e69f5e077f8ca768f47f8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-multiplesearch"

RDEPENDS:${PN} += "/usr/bin/sh \
vim"

inherit rpm
