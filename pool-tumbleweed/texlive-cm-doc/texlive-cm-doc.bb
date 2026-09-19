SUMMARY = "Documentation for texlive-cm"
DESCRIPTION = "This package includes the documentation for texlive-cm"
LICENSE = "SUSE-TeX"

PV = "2026.226.svn57963"

RPM_NAME = "texlive-cm-doc-2026.226.svn57963-60.2.noarch.rpm"
RPM_HASH = "7127ac89c3afcb24f913050caa3531dcd346bf8eb75d6c9a1a11652b7ec2f57fa6836203bb19a24e27cc0a092be56e3b4e3daf8643eb9d568b6b418370e36bb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cm-doc"

RDEPENDS:${PN} += ""

inherit rpm
