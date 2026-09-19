SUMMARY = "Documentation for texlive-regstats"
DESCRIPTION = "This package includes the documentation for texlive-regstats"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1bsvn78101"

RPM_NAME = "texlive-regstats-doc-2026.226.1.1bsvn78101-60.4.noarch.rpm"
RPM_HASH = "114bcc555ebaeaa4cb26561e8946bec757cea33b3ea3eae31e4718c06cc3cfd7e42262df24c12e8b02dee5ebebcad6a404a987264c7745705c9d4e9f23960a5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-regstats-doc"

RDEPENDS:${PN} += ""

inherit rpm
