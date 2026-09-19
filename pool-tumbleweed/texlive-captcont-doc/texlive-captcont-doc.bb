SUMMARY = "Documentation for texlive-captcont"
DESCRIPTION = "This package includes the documentation for texlive-captcont"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn77682"

RPM_NAME = "texlive-captcont-doc-2026.226.2.0svn77682-59.2.noarch.rpm"
RPM_HASH = "a1bf94473e07d06d4b01017e7d4344325c1f27a6c5dc6e6d28c1909a565d1f4c91d69b82e0b61d1fa5f91d718ee60e03486b3753cae667bd02e4c864b79ed3a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-captcont-doc"

RDEPENDS:${PN} += ""

inherit rpm
