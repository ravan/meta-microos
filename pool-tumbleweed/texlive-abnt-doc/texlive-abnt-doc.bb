SUMMARY = "Documentation for texlive-abnt"
DESCRIPTION = "This package includes the documentation for texlive-abnt"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn55471"

RPM_NAME = "texlive-abnt-doc-2026.226.svn55471-61.2.noarch.rpm"
RPM_HASH = "6f927f4a959faa616a53440fad9a78af3f0ac31a5831d29cbc07ad7d7b64eef1059b9dd0fcbfcf11113d476e73185dd7fdd5235b50f794f49a019ea920136ba6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-abnt-doc"

RDEPENDS:${PN} += ""

inherit rpm
