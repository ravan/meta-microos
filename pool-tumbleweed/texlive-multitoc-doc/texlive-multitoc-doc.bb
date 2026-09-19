SUMMARY = "Documentation for texlive-multitoc"
DESCRIPTION = "This package includes the documentation for texlive-multitoc"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.02svn77682"

RPM_NAME = "texlive-multitoc-doc-2026.226.2.02svn77682-61.2.noarch.rpm"
RPM_HASH = "89b051140aac09eedfa3e595ef0a9edb45874f1c563830f4d4d1e682b98c1d114be3da57291b2e6fa2c11cd580f63dc00a3b43762531840880d08a4b12c54095"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multitoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
