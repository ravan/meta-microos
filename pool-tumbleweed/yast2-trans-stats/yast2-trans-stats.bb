SUMMARY = "YaST2 - Translation Statistics"
DESCRIPTION = "The package contains statistic files (one file per language).  With the \
help of these statistics Yast warns you if you select a language for \
installation which is unsufficiently translated."
LICENSE = "GPL-2.0+"

PV = "2.19.0"

RPM_NAME = "yast2-trans-stats-2.19.0-17.28.noarch.rpm"
RPM_HASH = "8c6233fba9572ccf2f87b1e3d2226fb974c53f7c042c8be59b18be49d19483ed2aeebec401f67b03c6f39136f9a1b339c01bce7bc75ca162f7f4f56d6220b3ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-trans-stats"

RDEPENDS:${PN} += ""

inherit rpm
