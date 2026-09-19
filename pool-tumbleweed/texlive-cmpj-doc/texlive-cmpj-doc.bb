SUMMARY = "Documentation for texlive-cmpj"
DESCRIPTION = "This package includes the documentation for texlive-cmpj"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.03svn58506"

RPM_NAME = "texlive-cmpj-doc-2026.226.3.03svn58506-60.2.noarch.rpm"
RPM_HASH = "3f2c26369b4392d9fb311f3c2d5be84648f71b9a01ba667a41abea72f2fde9707c0ef4edd51ddd89e4f3433a3eac8f5e70c02c29f3c71633535f99d8a6b9b31c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmpj-doc"

RDEPENDS:${PN} += ""

inherit rpm
