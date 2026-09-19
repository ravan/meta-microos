SUMMARY = "Documentation files for python-fuse"
DESCRIPTION = "HTML Documentation and examples for python-fuse."
LICENSE = "LGPL-2.1-only"

PV = "1.0.9"

RPM_NAME = "python-fuse-doc-1.0.9-1.7.aarch64.rpm"
RPM_HASH = "b26aa0bbc7a0a9377a9606a18100f1a3701dc394081527e50d3f564a01161162736ded2f26af25e80d33ada6d4671586b5fa09303c68cf44a3c23c953d518981"

RPROVIDES:${PN} += "python-fuse-doc"

RDEPENDS:${PN} += ""

inherit rpm
