SUMMARY = "GTK key theme that sets ctrl-u in text entries"
DESCRIPTION = "A GTK key theme that makes ctrl-u, ctrl-w and ctrl-h work in text \
entries and text views. In contrast to the Emacs key theme which \
redefines many other common key bindings (like ctrl-p) this is \
one is reduced to the bare minimum to make text entries usable."
LICENSE = "GPL-2.0+"

PV = "1"

RPM_NAME = "gtk-key-theme-ctrluftw-1-12.24.noarch.rpm"
RPM_HASH = "4b332a7c68c9e46bb9b8d17354a7e1e60be33cf3ff91d805a71066c00365a679159869e3e503517c6cb6aaa605e1487a91ffeb60a2de17067a7a08d625fd5eed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk-key-theme-ctrluftw"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
