SUMMARY = "Documentation for texlive-dtk"
DESCRIPTION = "This package includes the documentation for texlive-dtk"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.10fsvn71776"

RPM_NAME = "texlive-dtk-doc-2026.226.2.10fsvn71776-59.2.noarch.rpm"
RPM_HASH = "1a16fcd68b3e62dbacad78e66e47b853fe58965c07f9d6d447d41344f7aebf80803b54713379a6386c1dd65b365f84d1f995f3dabbf437b84c7ddd9301b0860a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-dtk-doc-de \
texlive-dtk-doc"

RDEPENDS:${PN} += ""

inherit rpm
