SUMMARY = "Documentation for texlive-quran-en"
DESCRIPTION = "This package includes the documentation for texlive-quran-en"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.11svn74874"

RPM_NAME = "texlive-quran-en-doc-2026.226.0.0.11svn74874-60.4.noarch.rpm"
RPM_HASH = "510c5745a88a4336c7064c570e4e541f139586eede38a61c7ee5b03f2bb48228f4de2b82acef2363f57d4319cd9ca7fd96d2b36cd86fc4257dbee3712fffa19f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quran-en-doc"

RDEPENDS:${PN} += ""

inherit rpm
