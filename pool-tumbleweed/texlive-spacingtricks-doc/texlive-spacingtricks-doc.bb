SUMMARY = "Documentation for texlive-spacingtricks"
DESCRIPTION = "This package includes the documentation for texlive-spacingtricks"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.8svn69048"

RPM_NAME = "texlive-spacingtricks-doc-2026.226.1.8svn69048-64.2.noarch.rpm"
RPM_HASH = "7cfba5e221010dc320c3e3f84f4b62ee0dfecd6ad5122a8e726dc3c814190697bebe5506de1178ef291473c180f2ef4f2da29149922f5fd33544d5f2fe54bf55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spacingtricks-doc"

RDEPENDS:${PN} += ""

inherit rpm
