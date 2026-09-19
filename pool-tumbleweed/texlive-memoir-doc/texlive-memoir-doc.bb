SUMMARY = "Documentation for texlive-memoir"
DESCRIPTION = "This package includes the documentation for texlive-memoir"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.8.4bsvn77682"

RPM_NAME = "texlive-memoir-doc-2026.226.3.8.4bsvn77682-59.2.noarch.rpm"
RPM_HASH = "b82411996e626e66b02dcd2c577846ec679b50db285452e067c09d2705b87ae28a774e37af80cb6259eddc501c6de14662e2ad140d1a15d27ba7a1f0469bd456"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-memoir-doc"

RDEPENDS:${PN} += ""

inherit rpm
