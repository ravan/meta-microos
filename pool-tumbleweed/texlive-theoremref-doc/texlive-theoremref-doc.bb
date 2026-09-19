SUMMARY = "Documentation for texlive-theoremref"
DESCRIPTION = "This package includes the documentation for texlive-theoremref"
LICENSE = "LPPL-1.0"

PV = "2026.227.svn77682"

RPM_NAME = "texlive-theoremref-doc-2026.227.svn77682-62.2.noarch.rpm"
RPM_HASH = "fac84eed433572ca664d106620088ecf57783d9a774fe77d439e0b0f8d033a783983842746cbfed9563d0a468b72732f6292475419386819d3421625f06a7fa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-theoremref-doc"

RDEPENDS:${PN} += ""

inherit rpm
