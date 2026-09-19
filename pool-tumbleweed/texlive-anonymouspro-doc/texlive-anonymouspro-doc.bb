SUMMARY = "Documentation for texlive-anonymouspro"
DESCRIPTION = "This package includes the documentation for texlive-anonymouspro"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn51631"

RPM_NAME = "texlive-anonymouspro-doc-2026.226.2.2svn51631-61.2.noarch.rpm"
RPM_HASH = "ab5934a23290d45ccbedeed602f67865f10fbb6230a81adc63f5d4a2f8526a8564845a7d9aee19a95fe4b68f0422c9e4066786270a8726a087f3ebbc70868895"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-anonymouspro-doc"

RDEPENDS:${PN} += ""

inherit rpm
