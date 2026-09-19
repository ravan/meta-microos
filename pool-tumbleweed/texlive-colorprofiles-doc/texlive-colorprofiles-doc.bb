SUMMARY = "Documentation for texlive-colorprofiles"
DESCRIPTION = "This package includes the documentation for texlive-colorprofiles"
LICENSE = "LPPL-1.0"

PV = "2026.226.20181105svn49086"

RPM_NAME = "texlive-colorprofiles-doc-2026.226.20181105svn49086-60.2.noarch.rpm"
RPM_HASH = "871941eb8b41e2b55220febc3db51d881b0e344d5f1b33e09f7708a6952d76c30db2315f5a4e2b7464e2a3ae5d7b585d8094f9b05a7691073d23d562c6ccc9e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colorprofiles-doc"

RDEPENDS:${PN} += ""

inherit rpm
