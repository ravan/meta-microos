SUMMARY = "Documentation for texlive-minimalist"
DESCRIPTION = "This package includes the documentation for texlive-minimalist"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78004"

RPM_NAME = "texlive-minimalist-doc-2026.226.svn78004-61.2.noarch.rpm"
RPM_HASH = "5fab8962cbf2f94a4a814acb37d625c752f85a861af43c55cc46d73d27092ac0f04c767b68cc63eac2d1377045462c10c3b2554c624a309827e50f6aee8c821a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minimalist-doc"

RDEPENDS:${PN} += ""

inherit rpm
