SUMMARY = "Documentation for texlive-plari"
DESCRIPTION = "This package includes the documentation for texlive-plari"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-plari-doc-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "362ffc06b603f8a438c7ad593026928637d25a8fe0af9b5ed2f9d2c21fc412693c577fdb9f13772e0e33798a23df1e1529b8f93c0c18de489f758d3ed438a438"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plari-doc"

RDEPENDS:${PN} += ""

inherit rpm
