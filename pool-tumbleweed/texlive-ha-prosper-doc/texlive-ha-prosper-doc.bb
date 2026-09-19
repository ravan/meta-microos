SUMMARY = "Documentation for texlive-ha-prosper"
DESCRIPTION = "This package includes the documentation for texlive-ha-prosper"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.21svn59651"

RPM_NAME = "texlive-ha-prosper-doc-2026.226.4.21svn59651-60.4.noarch.rpm"
RPM_HASH = "39bea9731d0030a525a0343bd08d975ae22f26300722622f97424986c947a15a81f0cae9f0cb80863bfca3803f4b3c501aa4f6bb90dd10ef9ccb3324b1953a84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ha-prosper-doc"

RDEPENDS:${PN} += ""

inherit rpm
