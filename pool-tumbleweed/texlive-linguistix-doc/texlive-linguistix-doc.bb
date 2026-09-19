SUMMARY = "Documentation for texlive-linguistix"
DESCRIPTION = "This package includes the documentation for texlive-linguistix"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.8svn77571"

RPM_NAME = "texlive-linguistix-doc-2026.226.0.0.8svn77571-61.2.noarch.rpm"
RPM_HASH = "e74d0c3bed0e2443b65ff6bf7589e83570b2a569905f15c341358a0cefc74f2d89c73a553aa4a489f1ca4b855fb29ccd72912ee6cae694e863e98eb2f778a2de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-linguistix-doc"

RDEPENDS:${PN} += ""

inherit rpm
