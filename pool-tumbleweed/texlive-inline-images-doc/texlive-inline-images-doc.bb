SUMMARY = "Documentation for texlive-inline-images"
DESCRIPTION = "This package includes the documentation for texlive-inline-images"
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.1.0svn61719"

RPM_NAME = "texlive-inline-images-doc-2026.226.1.0svn61719-60.2.noarch.rpm"
RPM_HASH = "9290fa85632891b48a2473f79c47253aff9d27fb290617c11ffa9fce10c7d1410d361402807a080c0870ba4e0e862fe4f919ba1cf38801d83af03d9d9b83790f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inline-images-doc"

RDEPENDS:${PN} += ""

inherit rpm
