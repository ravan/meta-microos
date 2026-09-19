SUMMARY = "Documentation for texlive-ulem"
DESCRIPTION = "This package includes the documentation for texlive-ulem"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-ulem-doc-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "eac0e751fecde84df298bf38cdfdec655d0f65def69cac48752d1660108b30391ea373c95cbb75bfab6bcaeee7e5c8e826a0c94fa555eb6afeacb6e8a5185efc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ulem-doc"

RDEPENDS:${PN} += ""

inherit rpm
