SUMMARY = "Documentation for texlive-ocgx"
DESCRIPTION = "This package includes the documentation for texlive-ocgx"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn54512"

RPM_NAME = "texlive-ocgx-doc-2026.226.0.0.5svn54512-61.2.noarch.rpm"
RPM_HASH = "5613e4cd3633eb5f234ec8d40104fe5607c41343b96ab4443c73b81ee5021f9600d340003507968a983d6c73ebdb16cda63860b7a1ed668124cbb16be94a560e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ocgx-doc"

RDEPENDS:${PN} += ""

inherit rpm
