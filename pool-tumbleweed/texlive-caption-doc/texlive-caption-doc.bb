SUMMARY = "Documentation for texlive-caption"
DESCRIPTION = "This package includes the documentation for texlive-caption"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-caption-doc-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "c8c6c212b4be6fb752843aeaa6bd9902d4beded4066da5dc1d379f2629fff207dc0893ce6d825bc4813bcfdf0e133def79014f23ff5a4b07574bc1d0474fe203"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-caption-doc-en \
texlive-caption-doc"

RDEPENDS:${PN} += ""

inherit rpm
