SUMMARY = "Documentation for texlive-scaletextbullet"
DESCRIPTION = "This package includes the documentation for texlive-scaletextbullet"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.5svn77949"

RPM_NAME = "texlive-scaletextbullet-doc-2026.226.2.0.5svn77949-60.2.noarch.rpm"
RPM_HASH = "d33e3f0d4f34fce5323a1e52063470ba6beed5565b186375cbd0543388131e4d3c96d30720b634db4f33b19a4f378e2b8f6856f293a3fc85ca93837d0c9d0294"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scaletextbullet-doc"

RDEPENDS:${PN} += ""

inherit rpm
