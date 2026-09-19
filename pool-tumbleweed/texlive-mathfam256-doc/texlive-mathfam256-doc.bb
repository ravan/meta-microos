SUMMARY = "Documentation for texlive-mathfam256"
DESCRIPTION = "This package includes the documentation for texlive-mathfam256"
LICENSE = "BSD-3-Clause"

PV = "2026.226.0.0.5svn53519"

RPM_NAME = "texlive-mathfam256-doc-2026.226.0.0.5svn53519-59.2.noarch.rpm"
RPM_HASH = "6c4b5f02284e64c8e0c7b98356523a13e9a0ec57007baeb98b213749e81e1ec0fb132315ef6790de725f1803adb3f3045439f117a39acdadbeab7f5387962a04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathfam256-doc"

RDEPENDS:${PN} += ""

inherit rpm
