SUMMARY = "Documentation for texlive-tex4ebook"
DESCRIPTION = "This package includes the documentation for texlive-tex4ebook"
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.4dsvn78132"

RPM_NAME = "texlive-tex4ebook-doc-2026.227.0.0.4dsvn78132-62.2.noarch.rpm"
RPM_HASH = "b50ad0a10b29fcd418b37bfa8c853659186d055f250cf3096ff64812326036cb3fac5a0144eb5f81b6cb5e319b6689ee3b4f0b5d0f8efa9db544b465395b9ecb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex4ebook-doc"

RDEPENDS:${PN} += ""

inherit rpm
