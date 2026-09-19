SUMMARY = "Documentation for texlive-polski"
DESCRIPTION = "This package includes the documentation for texlive-polski"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.6svn78101"

RPM_NAME = "texlive-polski-doc-2026.226.1.3.6svn78101-59.2.noarch.rpm"
RPM_HASH = "73a9fe140ab07bc65a330f0bda75d737fdecd4673d941498a1307974ddd99737743a163a57c9cd039162c1693899791dfbcd9fbef78ee9cef4375e482a298085"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-polski-doc-pl \
texlive-polski-doc"

RDEPENDS:${PN} += ""

inherit rpm
