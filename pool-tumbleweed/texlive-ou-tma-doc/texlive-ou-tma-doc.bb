SUMMARY = "Documentation for texlive-ou-tma"
DESCRIPTION = "This package includes the documentation for texlive-ou-tma"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.21svn76460"

RPM_NAME = "texlive-ou-tma-doc-2026.226.1.21svn76460-61.2.noarch.rpm"
RPM_HASH = "beaa02f0cd7df9bb39b720e0baa3bb5bc946ee95a10a4628f87816bdb0085c1ac4572821251b069738499c197776459d01133138014adc02ba79a4623f2399d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ou-tma-doc"

RDEPENDS:${PN} += ""

inherit rpm
