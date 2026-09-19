SUMMARY = "Documentation for texlive-keyfloat"
DESCRIPTION = "This package includes the documentation for texlive-keyfloat"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.09svn77682"

RPM_NAME = "texlive-keyfloat-doc-2026.226.2.09svn77682-63.2.noarch.rpm"
RPM_HASH = "645077d1ca9e3613ad1dd5143995507f4883803e08e757cb9277788222b01f83902580cd559e37a89d4a242b642c63ed3d81726818778e536d473a04e32ed809"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-keyfloat-doc"

RDEPENDS:${PN} += ""

inherit rpm
