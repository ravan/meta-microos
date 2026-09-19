SUMMARY = "Documentation for texlive-classpack"
DESCRIPTION = "This package includes the documentation for texlive-classpack"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.19svn55218"

RPM_NAME = "texlive-classpack-doc-2026.226.1.19svn55218-60.2.noarch.rpm"
RPM_HASH = "0d874e71e33f0b4b970468140652300c087447a4c5673a6167bbdd9fff34198d4a795f0cc188ed61efefd76ddb877acd72ecabd2dae6a5c1b91e237d672f91d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-classpack-doc"

RDEPENDS:${PN} += ""

inherit rpm
