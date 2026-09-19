SUMMARY = "Documentation for texlive-aucklandthesis"
DESCRIPTION = "This package includes the documentation for texlive-aucklandthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn51323"

RPM_NAME = "texlive-aucklandthesis-doc-2026.226.svn51323-60.2.noarch.rpm"
RPM_HASH = "6126ff22fddc9e129f231ca0896dae1769155a81dbef49e9210a7ea0ef230231114af9a5933989acd69670f41392c8850ba2459aed5f25b6d296ce846786bdbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aucklandthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
