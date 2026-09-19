SUMMARY = "Documentation for texlive-clipboard"
DESCRIPTION = "This package includes the documentation for texlive-clipboard"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn78101"

RPM_NAME = "texlive-clipboard-doc-2026.226.0.0.3svn78101-60.2.noarch.rpm"
RPM_HASH = "f768d5c7e8e28193f69cc6cc853da49851dfd55fcca5d8a7c5750b9a93693984efe82348c2073f9e48a05a6499ea4c8f6687598aefd3ec9b94b3f2a0cbb44be0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-clipboard-doc"

RDEPENDS:${PN} += ""

inherit rpm
