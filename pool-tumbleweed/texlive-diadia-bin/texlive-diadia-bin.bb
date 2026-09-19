SUMMARY = "Binary files of diadia"
DESCRIPTION = "Binary files of diadia"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn37645"

RPM_NAME = "texlive-diadia-bin-2026.20260301.svn37645-120.4.noarch.rpm"
RPM_HASH = "a643f73398f7ce6b1a1205b85dcf35b2debab4a505f5bac7eb6f8d7a2f8b98355b0a69baec1b38f2410aad8ee11dcb75a86310f42214726a90fbdf121ae5eb7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-diadia-bin"

RDEPENDS:${PN} += "texlive-diadia"

inherit rpm
