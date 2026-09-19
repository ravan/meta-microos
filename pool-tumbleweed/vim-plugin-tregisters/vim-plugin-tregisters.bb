SUMMARY = "List, edit, and run/execute registers/clipboards"
DESCRIPTION = "List, edit, and run or execute registers and/or clipboards"
LICENSE = "GPL-1.0-or-later"

PV = "0.2"

RPM_NAME = "vim-plugin-tregisters-0.2-64.2.noarch.rpm"
RPM_HASH = "f7e42c233438a05e10a40f2124fe0bb52767ffe00e59221f64fa6a4369dc7eea97d38af02912855b8c4f0d1209caa990b1e7e2ebfbe66556d0bf497f15ab961d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-tregisters"

RDEPENDS:${PN} += "vim \
vim-plugin-tlib"

inherit rpm
