SUMMARY = "Documentation for texlive-tikz-bpmn"
DESCRIPTION = "This package includes the documentation for texlive-tikz-bpmn"
LICENSE = "LPPL-1.0"

PV = "2026.227.svn73368"

RPM_NAME = "texlive-tikz-bpmn-doc-2026.227.svn73368-62.2.noarch.rpm"
RPM_HASH = "1cb7adc0a760e791d814827ab0eecf26509c00c21d7d3ce8d508f6a445df29bc9bb1cddd8faf85c93a6b8787d9f8b1513799b485f3fcc7ad029dec9a1ff1b498"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-bpmn-doc"

RDEPENDS:${PN} += ""

inherit rpm
