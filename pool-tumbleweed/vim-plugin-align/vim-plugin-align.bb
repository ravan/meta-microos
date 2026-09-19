SUMMARY = "Plugin to produce aligned text, equations, declarations, etc"
DESCRIPTION = "Align lets you align statements on their equal signs, make comment boxes, align \
comments, align declarations, etc. It handles alignment on multiple separators, \
not just the first one, and the separators may be the same across the line or \
different."
LICENSE = "Vim"

PV = "37.43"

RPM_NAME = "vim-plugin-align-37.43-64.2.noarch.rpm"
RPM_HASH = "204b6bcdd894e45f105c351a17992364d40f80aac51a1993810ec7dd4ababee40e1e0587d8d9eaf3b7030914c05f4921582e203435e6c42ea1552d09dc238dd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-align"

RDEPENDS:${PN} += "/usr/bin/sh \
vim"

inherit rpm
