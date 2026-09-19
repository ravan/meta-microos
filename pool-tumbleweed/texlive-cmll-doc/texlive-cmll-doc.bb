SUMMARY = "Documentation for texlive-cmll"
DESCRIPTION = "This package includes the documentation for texlive-cmll"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-cmll-doc-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "9a09d642d1ef62b520f7622f98b2fc53575fd7c6e4cb83d32eb022c533ca73d59a0a670c0e22f40df050e10a179efbd9722e3bc7fa9ae16b3a6d22ccb66d4e44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmll-doc"

RDEPENDS:${PN} += ""

inherit rpm
