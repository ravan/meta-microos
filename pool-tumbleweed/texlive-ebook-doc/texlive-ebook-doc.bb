SUMMARY = "Documentation for texlive-ebook"
DESCRIPTION = "This package includes the documentation for texlive-ebook"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn29466"

RPM_NAME = "texlive-ebook-doc-2026.226.svn29466-61.4.noarch.rpm"
RPM_HASH = "64c22e092c513e13b18da28ba6acde39235e69df6b08e4750530df7e2c03fc5d38cd506d4eca3c3eb6a12781d14450a57f09580cdf90e31f4b67c6e2b506f09a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ebook-doc"

RDEPENDS:${PN} += ""

inherit rpm
