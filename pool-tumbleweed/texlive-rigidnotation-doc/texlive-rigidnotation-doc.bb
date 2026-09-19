SUMMARY = "Documentation for texlive-rigidnotation"
DESCRIPTION = "This package includes the documentation for texlive-rigidnotation"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn71264"

RPM_NAME = "texlive-rigidnotation-doc-2026.226.1.0.0svn71264-60.4.noarch.rpm"
RPM_HASH = "0b2fecff9a90c260b0ea06923ba0ecab46cc995b35e8146a7211f86436950bf8dc4b629010f795029468c07b1a58439f4827caded9934fb13971e1c7ec0d2289"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rigidnotation-doc"

RDEPENDS:${PN} += ""

inherit rpm
