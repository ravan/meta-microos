SUMMARY = "Documentation for texlive-jourrr"
DESCRIPTION = "This package includes the documentation for texlive-jourrr"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn68556"

RPM_NAME = "texlive-jourrr-doc-2026.226.svn68556-63.2.noarch.rpm"
RPM_HASH = "f3235280ad56a64300f8a3a4dea640d4b596010e257dcdb064ca8348a71f769f4451641e47013315332a9d42d7f770a03c7fd94d1ebb949bda7174d8c2bdf08c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jourrr-doc"

RDEPENDS:${PN} += ""

inherit rpm
