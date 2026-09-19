SUMMARY = "Documentation for texlive-odsfile"
DESCRIPTION = "This package includes the documentation for texlive-odsfile"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.10svn77682"

RPM_NAME = "texlive-odsfile-doc-2026.226.0.0.10svn77682-61.2.noarch.rpm"
RPM_HASH = "b4cf7ce02f020a0b1c3b01d6d25f6eee6b491accfec0325fddc8efa084750f7e4dc0bb0694c7cbc4bbbd8c68fcd4f1c5959694a20c7737e70c5a015c44bde3ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-odsfile-doc"

RDEPENDS:${PN} += ""

inherit rpm
