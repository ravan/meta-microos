SUMMARY = "Documentation for texlive-almendra"
DESCRIPTION = "This package includes the documentation for texlive-almendra"
LICENSE = "OFL-1.1"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-almendra-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "8f4cb8386ad4501808468c9ffc69db09320f84358a5091ef9c36feb026b2a4f4b79777900280eeb4af498b7bed0ac76ab48b26ce359c83a7d44553902eebfbb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-almendra-doc"

RDEPENDS:${PN} += ""

inherit rpm
