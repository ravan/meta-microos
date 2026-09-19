SUMMARY = "Documentation for texlive-eqnnumwarn"
DESCRIPTION = "This package includes the documentation for texlive-eqnnumwarn"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn75878"

RPM_NAME = "texlive-eqnnumwarn-doc-2026.226.1.0svn75878-61.4.noarch.rpm"
RPM_HASH = "64cb420cdfcb4a0d4ada300712b5de36e8787bba3222c442c52a2daf2b7e83121d989ed19fbe263f008b8f5e51edebab7f7a0b0d17062f7073022ffcba3b6bb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eqnnumwarn-doc"

RDEPENDS:${PN} += ""

inherit rpm
