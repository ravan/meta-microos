SUMMARY = "Documentation for texlive-setspace"
DESCRIPTION = "This package includes the documentation for texlive-setspace"
LICENSE = "LPPL-1.0"

PV = "2026.226.6.7bsvn77682"

RPM_NAME = "texlive-setspace-doc-2026.226.6.7bsvn77682-60.2.noarch.rpm"
RPM_HASH = "59055f523b40430ce5fb80e69a4dd1586073211adb729f5a1183b91dcae5165c4de39016148650982d3eb3b801248d1fbd5c6d038790be8b8d180d08f0a36263"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-setspace-doc"

RDEPENDS:${PN} += ""

inherit rpm
