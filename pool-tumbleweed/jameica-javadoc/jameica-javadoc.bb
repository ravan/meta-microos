SUMMARY = "Javadoc for jameica"
DESCRIPTION = "Developer documentation for Jameica."
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.0-only & CPL-1.0 & Zlib & MPL-1.0 & EPL-1.0"

PV = "2.12.0"

RPM_NAME = "jameica-javadoc-2.12.0-1.5.noarch.rpm"
RPM_HASH = "f791af38864cf1a34a0e44dd54541b7d127453ee6b3b23c167fe1a21a4d8b0d47e7913f2586ef500a17722e2326368310fbcb247f2dd4e0f5f45b00f198f6608"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jameica-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
