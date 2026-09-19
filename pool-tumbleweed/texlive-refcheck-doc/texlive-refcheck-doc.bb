SUMMARY = "Documentation for texlive-refcheck"
DESCRIPTION = "This package includes the documentation for texlive-refcheck"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.9.2svn77682"

RPM_NAME = "texlive-refcheck-doc-2026.226.1.9.2svn77682-60.4.noarch.rpm"
RPM_HASH = "906fc450e1503b9fbf07ec6ce4371e41cbb1eda70bfe39698b73006d825cf5be607eebcc8b97aab06bee3d3f4008daa203b2984f1b4e85394377bafc047213af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-refcheck-doc"

RDEPENDS:${PN} += ""

inherit rpm
