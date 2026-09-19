SUMMARY = "Documentation for texlive-biblatex-bath"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-bath"
LICENSE = "LPPL-1.0"

PV = "2026.226.7.2svn77530"

RPM_NAME = "texlive-biblatex-bath-doc-2026.226.7.2svn77530-61.2.noarch.rpm"
RPM_HASH = "86784d7406bf375ec2049ceb640f5e04d11b67122a7def29c3efcadc38ef202fdfc4204042bd04db8ecab306f89bcca72e33397e0085e5a9779491eb0ad5e222"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-bath-doc"

RDEPENDS:${PN} += ""

inherit rpm
