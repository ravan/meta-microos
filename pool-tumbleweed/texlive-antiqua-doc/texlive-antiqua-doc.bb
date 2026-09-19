SUMMARY = "Documentation for texlive-antiqua"
DESCRIPTION = "This package includes the documentation for texlive-antiqua"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.001.003svn24266"

RPM_NAME = "texlive-antiqua-doc-2026.226.001.003svn24266-61.2.noarch.rpm"
RPM_HASH = "a5519fa20ac31f6d694dfb6103950845491c304d1fb3965c6b7ab1851fb66c3302bd987590ee639be05b4dba74ad65e387665f2281e8c5787a941aff1cb0085e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-antiqua-doc"

RDEPENDS:${PN} += ""

inherit rpm
