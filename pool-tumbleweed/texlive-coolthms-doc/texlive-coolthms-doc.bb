SUMMARY = "Documentation for texlive-coolthms"
DESCRIPTION = "This package includes the documentation for texlive-coolthms"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn29062"

RPM_NAME = "texlive-coolthms-doc-2026.226.1.2svn29062-61.2.noarch.rpm"
RPM_HASH = "ea28653e905432acef004871b9636b7cb5f1ade26484d6b5da9955752fa4da4fcac59b96f9a79db4ccdeea041b0418876c04cf94600715772258a8e056f60edf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-coolthms-doc"

RDEPENDS:${PN} += ""

inherit rpm
