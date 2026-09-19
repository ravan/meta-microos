SUMMARY = "Documentation for texlive-gnuplottex"
DESCRIPTION = "This package includes the documentation for texlive-gnuplottex"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.9.5svn54758"

RPM_NAME = "texlive-gnuplottex-doc-2026.226.0.0.9.5svn54758-60.4.noarch.rpm"
RPM_HASH = "97fcee58061b7e4866c4fa965f5d6e1f54e6504e2501a216d2e7e634cb4c1c281c7ed94e22ec9afd50266e725781f1a5aa26220a0bacf1708502dcd244a34880"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gnuplottex-doc"

RDEPENDS:${PN} += ""

inherit rpm
