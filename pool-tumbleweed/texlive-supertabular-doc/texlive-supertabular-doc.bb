SUMMARY = "Documentation for texlive-supertabular"
DESCRIPTION = "This package includes the documentation for texlive-supertabular"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.2csvn77682"

RPM_NAME = "texlive-supertabular-doc-2026.226.4.2csvn77682-64.2.noarch.rpm"
RPM_HASH = "2c27cfcf11f57b3ce664349f51e1cd4668e6e6c79086b0a85c4879ec7be198f0bb49cbaf0485daed5f5bcdbd7a584c6c288469628b04c8220d6d6ec5d7569754"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-supertabular-doc"

RDEPENDS:${PN} += ""

inherit rpm
