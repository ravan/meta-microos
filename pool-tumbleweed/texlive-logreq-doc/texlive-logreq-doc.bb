SUMMARY = "Documentation for texlive-logreq"
DESCRIPTION = "This package includes the documentation for texlive-logreq"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn53003"

RPM_NAME = "texlive-logreq-doc-2026.226.1.0svn53003-61.2.noarch.rpm"
RPM_HASH = "a4c1301b5d4d93fa816bf5813a8710a0a5fc78bc957a93f1bfd4aec6fa0ee0918cdeaf6d960747f041a6260b97d73c6578e43ca4146a6eaff76259f646b4bbc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-logreq-doc"

RDEPENDS:${PN} += ""

inherit rpm
