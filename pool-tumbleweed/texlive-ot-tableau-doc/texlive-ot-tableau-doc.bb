SUMMARY = "Documentation for texlive-ot-tableau"
DESCRIPTION = "This package includes the documentation for texlive-ot-tableau"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn67813"

RPM_NAME = "texlive-ot-tableau-doc-2026.226.svn67813-61.2.noarch.rpm"
RPM_HASH = "09162324193937d79b197ac498b1f57df7541813f6c6cd0d5a73e9fb100e461aaa4446ff1dffb3144e4886caeb817301169677633f56de89cc50641f782efcb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ot-tableau-doc"

RDEPENDS:${PN} += ""

inherit rpm
