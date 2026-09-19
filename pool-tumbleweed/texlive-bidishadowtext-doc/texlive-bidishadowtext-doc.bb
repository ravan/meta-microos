SUMMARY = "Documentation for texlive-bidishadowtext"
DESCRIPTION = "This package includes the documentation for texlive-bidishadowtext"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn77682"

RPM_NAME = "texlive-bidishadowtext-doc-2026.226.0.0.1svn77682-61.2.noarch.rpm"
RPM_HASH = "e27e21f245eda0e6c641f0b61763409dca8f8124b4bedccb8a58871fd0a8d5a5761b7aabb261012ff02a3e6ae5e6ef289626d6f4a23f72cf39575251dd31d32e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bidishadowtext-doc"

RDEPENDS:${PN} += ""

inherit rpm
