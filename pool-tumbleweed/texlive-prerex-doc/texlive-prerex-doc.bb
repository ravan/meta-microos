SUMMARY = "Documentation for texlive-prerex"
DESCRIPTION = "This package includes the documentation for texlive-prerex"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn54512"

RPM_NAME = "texlive-prerex-doc-2026.226.svn54512-59.2.noarch.rpm"
RPM_HASH = "db3016055188d29a23041de5f7a7c3d56dd18dd92a067a60543199c9e5baaf366df39039b8b2d12a9375f11c1aeedf69d68a640bc6c3fd87d28f3f88910bd8f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-prerex.5 \
texlive-prerex-doc"

RDEPENDS:${PN} += ""

inherit rpm
