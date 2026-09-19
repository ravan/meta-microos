SUMMARY = "Documentation for texlive-xtab"
DESCRIPTION = "This package includes the documentation for texlive-xtab"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3fsvn77682"

RPM_NAME = "texlive-xtab-doc-2026.226.2.3fsvn77682-59.4.noarch.rpm"
RPM_HASH = "6ad5a0c2c037f6157d5d26ad861bd795137e9ecfce4974ea58fe779f73ec8bcfbb190d9fe0271d2744c418f9dbfd65bfd7f99b15dfd4b728518ff286c42ba056"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xtab-doc"

RDEPENDS:${PN} += ""

inherit rpm
