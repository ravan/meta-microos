SUMMARY = "Documentation for texlive-rmpage"
DESCRIPTION = "This package includes the documentation for texlive-rmpage"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.92svn54080"

RPM_NAME = "texlive-rmpage-doc-2026.226.0.0.92svn54080-60.4.noarch.rpm"
RPM_HASH = "5fa50001b1274ac3ee8de5e1d1d1487fbf5ca5e6178f40843d26f6987f8e9ec3b8daf7454ad30b40b3090c3cf1efd9206f60441c8d91c37d402110b558d35503"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rmpage-doc"

RDEPENDS:${PN} += ""

inherit rpm
