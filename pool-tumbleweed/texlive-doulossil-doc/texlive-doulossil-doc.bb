SUMMARY = "Documentation for texlive-doulossil"
DESCRIPTION = "This package includes the documentation for texlive-doulossil"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.1svn63255"

RPM_NAME = "texlive-doulossil-doc-2026.226.0.0.1svn63255-59.2.noarch.rpm"
RPM_HASH = "164e1258990f4fd9890877366895a36943d68bc3be9f550583e0eb9a72fa2d5887e6a95fbee1435feaa0e20a77bd7af1dafb2a9f7b66b138198e6f383956d53b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-doulossil-doc"

RDEPENDS:${PN} += ""

inherit rpm
