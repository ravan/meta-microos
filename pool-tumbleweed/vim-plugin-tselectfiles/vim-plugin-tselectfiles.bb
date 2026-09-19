SUMMARY = "A quick file selector/browser/explorer"
DESCRIPTION = "This plugin provides a simple file browser. It is not a full blown explorer but \
can be nevertheless be useful for quickly selecting a few files or renaming \
them."
LICENSE = "GPL-1.0-or-later"

PV = "0.11"

RPM_NAME = "vim-plugin-tselectfiles-0.11-64.2.noarch.rpm"
RPM_HASH = "8f225c7fe9740b1aa4812c9cbc33e8fd80432e48e9a788127040629a710979850c41daed46c665232f6ae1024f472ed9143e5a8dcc03b6e21ed16cee5e1eeb09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-tselectfiles"

RDEPENDS:${PN} += "/usr/bin/sh \
vim \
vim-plugin-tlib"

inherit rpm
