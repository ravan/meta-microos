SUMMARY = "Documentation for texlive-mathgreeks"
DESCRIPTION = "This package includes the documentation for texlive-mathgreeks"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn71248"

RPM_NAME = "texlive-mathgreeks-doc-2026.226.1.2svn71248-59.2.noarch.rpm"
RPM_HASH = "adb11f78686d481a148ce1ffa7e43693cbea5e436221597294fd1ceea9c2ab812719175c516f4e618771756b42c05c6e9c3624865e3d9dceaeb37ad4efe7722e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathgreeks-doc"

RDEPENDS:${PN} += ""

inherit rpm
