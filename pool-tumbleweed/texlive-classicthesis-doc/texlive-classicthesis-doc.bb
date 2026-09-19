SUMMARY = "Documentation for texlive-classicthesis"
DESCRIPTION = "This package includes the documentation for texlive-classicthesis"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.4.8svn73676"

RPM_NAME = "texlive-classicthesis-doc-2026.226.4.8svn73676-60.2.noarch.rpm"
RPM_HASH = "5b041d959fafa9e6eccfd1fb15e77ad9603a5d6725d600361b398f7aca46d877dace679ca93d23e2b8d584ef7d0fa6da3e195cac3acb0597390528dad332025b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-classicthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
