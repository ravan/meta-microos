SUMMARY = "Documentation for texlive-ean13isbn"
DESCRIPTION = "This package includes the documentation for texlive-ean13isbn"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn57514"

RPM_NAME = "texlive-ean13isbn-doc-2026.226.svn57514-61.4.noarch.rpm"
RPM_HASH = "9674f4236ef43a320c8c013f704e612f7bc81ac61590f8ed3222a664217a76050a22548a8e75f6c060e834f9dac4afb864cd2d95d80d283fd9c67c4e7c634b63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ean13isbn-doc"

RDEPENDS:${PN} += ""

inherit rpm
