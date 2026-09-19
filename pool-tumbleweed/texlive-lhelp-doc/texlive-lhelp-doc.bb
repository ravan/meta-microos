SUMMARY = "Documentation for texlive-lhelp"
DESCRIPTION = "This package includes the documentation for texlive-lhelp"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.0svn76924"

RPM_NAME = "texlive-lhelp-doc-2026.226.2.0svn76924-61.2.noarch.rpm"
RPM_HASH = "131a7ea450a5bb91f2adb6439f84ee501eec774ed5f20cbc22789cacbc1c8cdc32c6227566d374990e1a1732dd82a2ec7ba24169268912223e65991512cbde2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lhelp-doc"

RDEPENDS:${PN} += ""

inherit rpm
