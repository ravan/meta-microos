SUMMARY = "Documentation for texlive-pdfreview"
DESCRIPTION = "This package includes the documentation for texlive-pdfreview"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn50100"

RPM_NAME = "texlive-pdfreview-doc-2026.226.1.2svn50100-58.2.noarch.rpm"
RPM_HASH = "5cd9cfa074b8eefa90f468e68ce55b175800d742f92a99a3bb2e866d6d4735459b206f32ae67fe63dc715233b35096db135db2fdd1ea1e5b1db0eb593cb02dd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfreview-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
