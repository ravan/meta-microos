SUMMARY = "Documentation for texlive-geradwp"
DESCRIPTION = "This package includes the documentation for texlive-geradwp"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn63134"

RPM_NAME = "texlive-geradwp-doc-2026.226.1.1svn63134-60.2.noarch.rpm"
RPM_HASH = "6c2cdb3eda178667171062f4a1047a343d03c6f6ec6565fb616ec2d67a936e350ee40321b846dee01a9284fc3d8d5b490dbcff07d4593d078e052927c74547f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-geradwp-doc-fr \
texlive-geradwp-doc"

RDEPENDS:${PN} += ""

inherit rpm
