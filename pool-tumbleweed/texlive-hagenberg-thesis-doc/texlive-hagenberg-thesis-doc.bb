SUMMARY = "Documentation for texlive-hagenberg-thesis"
DESCRIPTION = "This package includes the documentation for texlive-hagenberg-thesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn74272"

RPM_NAME = "texlive-hagenberg-thesis-doc-2026.226.svn74272-60.4.noarch.rpm"
RPM_HASH = "4a615dff3455741cb619c738620b22c8bb6077082686e12a3593eb270bd7ead3439cee50c0760ff6af094ec259982709efd166e59f64f579b7445bb7e658749d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hagenberg-thesis-doc-de;en \
texlive-hagenberg-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
