SUMMARY = "Documentation for texlive-arabi-add"
DESCRIPTION = "This package includes the documentation for texlive-arabi-add"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn67573"

RPM_NAME = "texlive-arabi-add-doc-2026.226.1.0svn67573-61.2.noarch.rpm"
RPM_HASH = "d2de70acb00c9c760e709405c7bfe833c58ec61c9a01f32284d5c0e93d3a26ff449900ba395f8cb159544242bd9fabdad5b70235223f7250f2d5872c18175585"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arabi-add-doc"

RDEPENDS:${PN} += ""

inherit rpm
