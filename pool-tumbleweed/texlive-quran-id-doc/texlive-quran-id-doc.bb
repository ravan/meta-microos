SUMMARY = "Documentation for texlive-quran-id"
DESCRIPTION = "This package includes the documentation for texlive-quran-id"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.11svn74874"

RPM_NAME = "texlive-quran-id-doc-2026.226.0.0.11svn74874-60.4.noarch.rpm"
RPM_HASH = "ed2e7ff322a092b4d556f52f532ee4a22f0db850b9d8e286722517ea6e97f9e4fa548ffccc21d7b1e3ed7f64237ebdd77ad020b17c33aacec0b6c65726389634"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quran-id-doc"

RDEPENDS:${PN} += ""

inherit rpm
