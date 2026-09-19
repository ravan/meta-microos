SUMMARY = "Documentation for texlive-keyvaltable"
DESCRIPTION = "This package includes the documentation for texlive-keyvaltable"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3svn77682"

RPM_NAME = "texlive-keyvaltable-doc-2026.226.2.3svn77682-63.2.noarch.rpm"
RPM_HASH = "e79c0053f6a47abad61960ce1b317cf36964cbda332fb116d0e41a4dcca8fd1e3491fad52fc8001b7deb2d5fab86be4a57733dd7ffe0d79ace885342082faaa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-keyvaltable-doc"

RDEPENDS:${PN} += ""

inherit rpm
