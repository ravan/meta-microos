SUMMARY = "MATE Desktop faenza compilation theme, dark variant"
DESCRIPTION = "This icon theme uses Faenza and Faience icon themes by ~Tiheum and \
some icons customised for MATE by Rowen Stipe. Also, there are some \
icons from Mint-X-F and Faenza-Fresh icon packs."
LICENSE = "GPL-3.0-only"

PV = "1.20.0"

RPM_NAME = "mate-icon-theme-faenza-dark-1.20.0-1.20.noarch.rpm"
RPM_HASH = "2dfdc8377ecd0e5eb701be2c9151aee3687c2936b9207507871199e75df6d4e1ccda0647670284128485d527d443ac876abd30f46d44f3575bf0582c097375a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-icon-theme-faenza-dark"

RDEPENDS:${PN} += "mate-icon-theme-faenza"

inherit rpm
