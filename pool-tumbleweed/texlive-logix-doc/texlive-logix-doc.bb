SUMMARY = "Documentation for texlive-logix"
DESCRIPTION = "This package includes the documentation for texlive-logix"
LICENSE = "OFL-1.1"

PV = "2026.226.1.13svn63688"

RPM_NAME = "texlive-logix-doc-2026.226.1.13svn63688-61.2.noarch.rpm"
RPM_HASH = "ae91af0d9c3992d17279ece7559e36cf797b7dbadab527739b81302b50c3cd4c4cffd48a69d51ff88dfbb25aa27408771d671878ad0a0f215fac5dadc25eba25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-logix-doc"

RDEPENDS:${PN} += ""

inherit rpm
