SUMMARY = "Documentation for dynare in HTML format"
DESCRIPTION = "This package provides documentation for dynare in HTML format."
LICENSE = "GPL-3.0-or-later"

PV = "6.5"

RPM_NAME = "dynare-doc-html-6.5-1.7.noarch.rpm"
RPM_HASH = "e7eac9630b213a9a62cdcf53a25d9e01970b954bace3edd590c980f20d8bc9a930798d7528cd26aa4fd2d10851caab5face000acb821bf30515f7e97a9d2caad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dynare-doc-html"

RDEPENDS:${PN} += ""

inherit rpm
