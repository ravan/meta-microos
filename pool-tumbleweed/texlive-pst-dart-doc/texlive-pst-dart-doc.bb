SUMMARY = "Documentation for texlive-pst-dart"
DESCRIPTION = "This package includes the documentation for texlive-pst-dart"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.03svn60476"

RPM_NAME = "texlive-pst-dart-doc-2026.226.0.0.03svn60476-59.2.noarch.rpm"
RPM_HASH = "be5201a5da011ffa421808b1c6e3f18fee39bb263275381342223d9001b7cf89136faf8bdf1aa6bb112f516a37e2e16f0c4c6f6f9558a4e38dced33081110f85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-dart-doc"

RDEPENDS:${PN} += ""

inherit rpm
