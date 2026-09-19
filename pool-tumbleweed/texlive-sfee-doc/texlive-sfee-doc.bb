SUMMARY = "Documentation for texlive-sfee"
DESCRIPTION = "This package includes the documentation for texlive-sfee"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn70718"

RPM_NAME = "texlive-sfee-doc-2026.226.1.0svn70718-60.2.noarch.rpm"
RPM_HASH = "3d001b0ab3ae34cc9ce86c63c823fb2971c19318db0f871f8393bf0e4f287ac3c4dade60068bdc8ca78e7d9b473eb1e2d85e5af82199b27c726f32512fd90ac8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sfee-doc"

RDEPENDS:${PN} += ""

inherit rpm
