SUMMARY = "MATE Desktop Faenza compilation theme"
DESCRIPTION = "This icon theme uses Faenza and Faience icon themes by ~Tiheum and \
some icons customised for MATE by Rowen Stipe. Also, there are some \
icons from Mint-X-F and Faenza-Fresh icon packs."
LICENSE = "GPL-3.0-only"

PV = "1.20.0"

RPM_NAME = "mate-icon-theme-faenza-1.20.0-1.20.noarch.rpm"
RPM_HASH = "d7f56627629d669c5963a7d306fae699a08050d504aab9a265b405213a0590b1635e5ad8df36d68b0ebfb4035ef362b8d772b9c3ab4218543e231fb9dd0ca992"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-icon-theme-faenza"

RDEPENDS:${PN} += ""

inherit rpm
