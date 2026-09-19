SUMMARY = "Documentation for texlive-rsfs"
DESCRIPTION = "This package includes the documentation for texlive-rsfs"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-rsfs-doc-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "6d6dc721ff13814dbd15e5cbfcde7da97d9bd96d52469e649ef12c32e2de85bb3654cd6944066c2abf782b3c3eac7a78b58e021a46eaa5f94d02676496a0b429"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rsfs-doc"

RDEPENDS:${PN} += ""

inherit rpm
