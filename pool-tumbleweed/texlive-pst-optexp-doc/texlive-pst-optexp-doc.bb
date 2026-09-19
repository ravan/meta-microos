SUMMARY = "Documentation for texlive-pst-optexp"
DESCRIPTION = "This package includes the documentation for texlive-pst-optexp"
LICENSE = "LPPL-1.0"

PV = "2026.226.6.1svn62977"

RPM_NAME = "texlive-pst-optexp-doc-2026.226.6.1svn62977-59.2.noarch.rpm"
RPM_HASH = "fcde57274aabf59ad240ba0e0aa052304aeb001cc49f2beeaac391813f9a5b81926677121d8f8b1b335f2126dd14d764a0efa45e25380a983becca4ccecf56ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-optexp-doc-de;en \
texlive-pst-optexp-doc"

RDEPENDS:${PN} += ""

inherit rpm
