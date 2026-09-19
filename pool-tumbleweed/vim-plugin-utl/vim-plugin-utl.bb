SUMMARY = "Universal text linking for vim"
DESCRIPTION = "Universal text link allows you to set hyperlinks within your text documents. \
Hyperlinks can be used to start applications, open related documents, or \
bookmark parts of your text document."
LICENSE = "GPL-1.0-or-later"

PV = "2.0"

RPM_NAME = "vim-plugin-utl-2.0-64.2.noarch.rpm"
RPM_HASH = "ffe60152415036e87ed35d1d32b9fccbab7d7c163291808ec174e60fbb86b05fb6f940166c71b2aa1ca1dc1077686a21f382b63dea54b9bb8a31ebcde9a3deb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-utl"

RDEPENDS:${PN} += "/usr/bin/sh \
vim"

inherit rpm
