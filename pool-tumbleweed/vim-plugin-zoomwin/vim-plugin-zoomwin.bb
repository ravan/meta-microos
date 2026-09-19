SUMMARY = "Zoom in/out of windows (toggle between one window and multi-window)"
DESCRIPTION = "The idea is to make it easy to zoom into and out of a window. \
Usage: \
 \
     Press <c-w>o : the current window zooms into a full screen \
     Press <c-w>o again: the previous set of windows is restored"
LICENSE = "Vim"

PV = "24"

RPM_NAME = "vim-plugin-zoomwin-24-64.2.noarch.rpm"
RPM_HASH = "1d9ed1352a40a3cd4c3d3244fcfa667b7c1d7036763ba7ed4a117ca19198fa84567e758bc45b661a8114a156c106735d021407119439ec74c46269398f8c2f15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-zoomwin"

RDEPENDS:${PN} += "/usr/bin/sh \
vim"

inherit rpm
