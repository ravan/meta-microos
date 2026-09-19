SUMMARY = "Documentation for texlive-jurabib"
DESCRIPTION = "This package includes the documentation for texlive-jurabib"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.6svn77682"

RPM_NAME = "texlive-jurabib-doc-2026.226.0.0.6svn77682-63.2.noarch.rpm"
RPM_HASH = "bdf330d16e9d026926a4baf1e5547f76da8235de21021fe4ba5f9acaf8f61b35c4ef6302989677fa21039fc092555a25638be9669803a8319b4d5eff1547900f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-jurabib-doc-en;de \
texlive-jurabib-doc"

RDEPENDS:${PN} += ""

inherit rpm
