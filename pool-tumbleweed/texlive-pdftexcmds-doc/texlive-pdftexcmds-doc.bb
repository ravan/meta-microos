SUMMARY = "Documentation for texlive-pdftexcmds"
DESCRIPTION = "This package includes the documentation for texlive-pdftexcmds"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.33svn77682"

RPM_NAME = "texlive-pdftexcmds-doc-2026.226.0.0.33svn77682-58.2.noarch.rpm"
RPM_HASH = "aad282c4fd6a85612b89e5c7461ccecb7cbe83aa8ca4be72fe0390f1891f9351d4b4d5f1d427f0582d6c0bae1036fc71d50cb81e25d7600f7b3c6de7cc3d59b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdftexcmds-doc"

RDEPENDS:${PN} += ""

inherit rpm
