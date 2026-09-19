SUMMARY = "Documentation for texlive-chscite"
DESCRIPTION = "This package includes the documentation for texlive-chscite"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.9999svn28552"

RPM_NAME = "texlive-chscite-doc-2026.226.2.9999svn28552-60.2.noarch.rpm"
RPM_HASH = "c50ab18ba7866ac0ec2c0fe23bc681f7afb10b062e069f6fee929253170f0f4c8523b25744c9688ec7722115a924d1bfb5365e4a1799078c97f8a7e1c5b36d12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chscite-doc"

RDEPENDS:${PN} += ""

inherit rpm
