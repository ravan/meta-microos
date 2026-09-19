SUMMARY = "Documentation for texlive-subtext"
DESCRIPTION = "This package includes the documentation for texlive-subtext"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn51273"

RPM_NAME = "texlive-subtext-doc-2026.226.1.1svn51273-64.2.noarch.rpm"
RPM_HASH = "3ad2e6927db3ab7dbda09c4401e650cb0cd65e436e97cb7ded18f64d4bb89b206fc907d49f516a7178f4e98c334f107a7747bfd9b3470288ddcbd0cc680db86e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-subtext-doc"

RDEPENDS:${PN} += ""

inherit rpm
