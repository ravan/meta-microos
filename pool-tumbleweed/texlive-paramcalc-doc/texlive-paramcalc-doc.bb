SUMMARY = "Documentation for texlive-paramcalc"
DESCRIPTION = "This package includes the documentation for texlive-paramcalc"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77518"

RPM_NAME = "texlive-paramcalc-doc-2026.226.1.0svn77518-58.2.noarch.rpm"
RPM_HASH = "1dee8285b80c77da51f1d8417987d2118808e0adc250d0910bc4c22dcd61eefd22d763483c2a9bd4d191c1ea2fb1e8dce92f7aec5784972f0822d679ff08535f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-paramcalc-doc"

RDEPENDS:${PN} += ""

inherit rpm
