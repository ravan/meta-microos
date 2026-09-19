SUMMARY = "Documentation for texlive-luasseq"
DESCRIPTION = "This package includes the documentation for texlive-luasseq"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn65511"

RPM_NAME = "texlive-luasseq-doc-2026.226.svn65511-59.2.noarch.rpm"
RPM_HASH = "16dc6ff4aa1808f4fffbe872f79e539edac7ac6a0739c6eb221bd59e15fa8f0c4a6bde8827287a3a17787576b36be9b9083f20feb2e0e58662552e3104c94663"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luasseq-doc"

RDEPENDS:${PN} += ""

inherit rpm
