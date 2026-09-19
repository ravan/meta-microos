SUMMARY = "Documentation for texlive-enumitem-zref"
DESCRIPTION = "This package includes the documentation for texlive-enumitem-zref"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.8svn75712"

RPM_NAME = "texlive-enumitem-zref-doc-2026.226.1.8svn75712-61.4.noarch.rpm"
RPM_HASH = "a59a92220b461a7e08a7b90a3dc65c77e9f5303a7f70626f6b09a78ce13bc05753b312114a5dd9228bb80fdbf66356e5208a84492a5b094e0c4eaaa4f5ff79e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-enumitem-zref-doc"

RDEPENDS:${PN} += ""

inherit rpm
