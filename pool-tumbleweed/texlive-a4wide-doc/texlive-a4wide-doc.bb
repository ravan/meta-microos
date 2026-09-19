SUMMARY = "Documentation for texlive-a4wide"
DESCRIPTION = "This package includes the documentation for texlive-a4wide"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-a4wide-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "047ace5c1ca4888500776f0fa3fb8d989a69e05a6933c59751c64813395ba98c92fba577ae887e971c2aeade2160b1b2c60df96a586b1200b14ff868838b506b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-a4wide-doc"

RDEPENDS:${PN} += ""

inherit rpm
