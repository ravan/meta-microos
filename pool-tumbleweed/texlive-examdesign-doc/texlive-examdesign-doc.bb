SUMMARY = "Documentation for texlive-examdesign"
DESCRIPTION = "This package includes the documentation for texlive-examdesign"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.101svn15878"

RPM_NAME = "texlive-examdesign-doc-2026.226.1.101svn15878-59.2.noarch.rpm"
RPM_HASH = "bb675d9975bff61c62cf2a8def6bec0ebbd4cd66f79138cd92162127a168e218842515009df6a7d9f12f77a7e7c271d87915d2a0f63b3b2a200d61b377739536"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-examdesign-doc"

RDEPENDS:${PN} += ""

inherit rpm
