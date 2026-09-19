SUMMARY = "Documentation for texlive-invoice2"
DESCRIPTION = "This package includes the documentation for texlive-invoice2"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn67327"

RPM_NAME = "texlive-invoice2-doc-2026.226.svn67327-60.2.noarch.rpm"
RPM_HASH = "d3b35ae8799a3c48a599fe878bdc6f88ffd94ad9b0d4ca950a7cf350dd62875a51e5ccf232482770694efd2a0b2e9fda14efca89e92e0615bb8a05021691303a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-invoice2-doc"

RDEPENDS:${PN} += ""

inherit rpm
