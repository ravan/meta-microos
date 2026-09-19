SUMMARY = "Documentation for texlive-type1cm"
DESCRIPTION = "This package includes the documentation for texlive-type1cm"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78101"

RPM_NAME = "texlive-type1cm-doc-2026.226.svn78101-59.2.noarch.rpm"
RPM_HASH = "0ca5fa309f263bfb981a33c424c94bc4229ef99488570dce94c1ff41694e5e7bd5d7c49464bc2ef684895b9b2bd6521bb61f54dc9e9e7b49cf1db6cbc2bdc3f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-type1cm-doc"

RDEPENDS:${PN} += ""

inherit rpm
