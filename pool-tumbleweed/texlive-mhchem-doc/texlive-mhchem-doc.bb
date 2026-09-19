SUMMARY = "Documentation for texlive-mhchem"
DESCRIPTION = "This package includes the documentation for texlive-mhchem"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn69639"

RPM_NAME = "texlive-mhchem-doc-2026.226.svn69639-61.2.noarch.rpm"
RPM_HASH = "ee58e5d1edf3e2a75fbe72925a9bcd7c82fd08cd0c9f4198f4ce43f1b7533ec946059148fa0c27ae7d9b36e9ce5b2115464606582ebac33eef14f2b5f614e90a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mhchem-doc"

RDEPENDS:${PN} += ""

inherit rpm
