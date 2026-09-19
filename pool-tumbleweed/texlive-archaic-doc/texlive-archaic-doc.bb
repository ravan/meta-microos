SUMMARY = "Documentation for texlive-archaic"
DESCRIPTION = "This package includes the documentation for texlive-archaic"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn38005"

RPM_NAME = "texlive-archaic-doc-2026.226.svn38005-61.2.noarch.rpm"
RPM_HASH = "7a92d6ebf3494bcee22733856f1fd7b618e54fc412f2e24fa9fe649093dc7440bf30dd95380cb818db92e1ddf0d188b20dabec20e3e786f3cc3ff2a0912f5738"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-archaic-doc"

RDEPENDS:${PN} += ""

inherit rpm
