SUMMARY = "Documentation for texlive-chinese-jfm"
DESCRIPTION = "This package includes the documentation for texlive-chinese-jfm"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.1svn57758"

RPM_NAME = "texlive-chinese-jfm-doc-2026.226.1.1.1svn57758-60.2.noarch.rpm"
RPM_HASH = "6778253a300f9306aa08538c03cdb5d4147460270f1e5f547402e1acebcd3712416cf7410fb63cb5e1d03e963f354f525db85bba6fb1a1a1322638e10e9ec6ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-chinese-jfm-doc-zh \
texlive-chinese-jfm-doc"

RDEPENDS:${PN} += ""

inherit rpm
