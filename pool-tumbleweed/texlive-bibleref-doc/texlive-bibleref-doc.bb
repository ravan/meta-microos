SUMMARY = "Documentation for texlive-bibleref"
DESCRIPTION = "This package includes the documentation for texlive-bibleref"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.26.0svn75257"

RPM_NAME = "texlive-bibleref-doc-2026.226.1.26.0svn75257-61.2.noarch.rpm"
RPM_HASH = "8ed9db8555fc4a37bb3e3598aec8c2e0bdc5ce869b9e3f77111a62d6b842c79d3d7eff0fbf6cb2eb02580a63dbde8ef29922d77fb9468113dd2c368a2e2e0adf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibleref-doc"

RDEPENDS:${PN} += ""

inherit rpm
