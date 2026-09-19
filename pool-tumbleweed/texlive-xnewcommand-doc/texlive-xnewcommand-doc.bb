SUMMARY = "Documentation for texlive-xnewcommand"
DESCRIPTION = "This package includes the documentation for texlive-xnewcommand"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn15878"

RPM_NAME = "texlive-xnewcommand-doc-2026.226.1.2svn15878-59.4.noarch.rpm"
RPM_HASH = "503122a78d1e2e77b17da77508e9029057c98088c70e0566426b1f861f8e85116dbe3bcc9560f7265df607e9ab95c58375bfc984030f234796df29bd2dae0bbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xnewcommand-doc"

RDEPENDS:${PN} += ""

inherit rpm
