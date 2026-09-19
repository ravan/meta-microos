SUMMARY = "Documentation for texlive-abbr"
DESCRIPTION = "This package includes the documentation for texlive-abbr"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn77161"

RPM_NAME = "texlive-abbr-doc-2026.226.svn77161-61.2.noarch.rpm"
RPM_HASH = "d27351e84d3ff88d126849c0f155554a86dba2b9f67cf7b9913ebbe4bde52c8f566653dc204f091d2f928c17758cb9b6eda780416b10464cb3be48cdd9afb1f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-abbr-doc"

RDEPENDS:${PN} += ""

inherit rpm
