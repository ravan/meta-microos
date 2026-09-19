SUMMARY = "Documentation for texlive-afm2pl"
DESCRIPTION = "This package includes the documentation for texlive-afm2pl"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn71515"

RPM_NAME = "texlive-afm2pl-doc-2026.226.svn71515-61.2.noarch.rpm"
RPM_HASH = "6c60d3fe5ff20d4bfb989a9cb7c19c3102d5880869a3d8fa0232fe3c630bb6327db3f7731f9c467b7c84cb9390806668d5434a4a16d81b72e45f348ee749b15d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-afm2pl.1 \
texlive-afm2pl-doc"

RDEPENDS:${PN} += ""

inherit rpm
