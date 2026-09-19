SUMMARY = "Documentation for texlive-lstaddons"
DESCRIPTION = "This package includes the documentation for texlive-lstaddons"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn72068"

RPM_NAME = "texlive-lstaddons-doc-2026.226.0.0.2svn72068-59.2.noarch.rpm"
RPM_HASH = "5b20b74b32f579be3d996dcd7750f3c9331da6887d89cee824e8171c71db6eef4f11b43692259b59daaf34db7b54edc9dfbb295caf5d5e5a9f2b45a07f06df4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lstaddons-doc"

RDEPENDS:${PN} += ""

inherit rpm
