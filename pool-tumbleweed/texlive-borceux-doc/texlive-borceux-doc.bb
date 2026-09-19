SUMMARY = "Documentation for texlive-borceux"
DESCRIPTION = "This package includes the documentation for texlive-borceux"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn21047"

RPM_NAME = "texlive-borceux-doc-2026.226.svn21047-59.2.noarch.rpm"
RPM_HASH = "476aa020c92de0236b1c277c3d500e47407cee6612d8f004968e68bde0ecb666f8c35afadbda44f344b0af80aa3d6076317b39848a81f32bf0a8b98f8cc47f2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-borceux-doc"

RDEPENDS:${PN} += ""

inherit rpm
