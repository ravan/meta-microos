SUMMARY = "Documentation for texlive-xesearch"
DESCRIPTION = "This package includes the documentation for texlive-xesearch"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn77682"

RPM_NAME = "texlive-xesearch-doc-2026.226.0.0.2svn77682-59.4.noarch.rpm"
RPM_HASH = "af92302fffd6a1e56dfe27c0377b7907f73955b9aa6eaa6ad2bd0b2c3741d99ff015a97aed069ef61223cf866d7fba4a4e9caa50afc1ed963ed94201a573c464"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xesearch-doc"

RDEPENDS:${PN} += ""

inherit rpm
