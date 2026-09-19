SUMMARY = "Documentation for texlive-dsptricks"
DESCRIPTION = "This package includes the documentation for texlive-dsptricks"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn68753"

RPM_NAME = "texlive-dsptricks-doc-2026.226.1.1svn68753-59.2.noarch.rpm"
RPM_HASH = "ed6171c966e909b1440ec66d9d6e11339866d6d720592e277e59e0b750c68ca0b339e326934811f127524f82f7c62b72fc5843f8a405e9cba97a3581bfcd014f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dsptricks-doc"

RDEPENDS:${PN} += ""

inherit rpm
