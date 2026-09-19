SUMMARY = "Documentation for texlive-hycolor"
DESCRIPTION = "This package includes the documentation for texlive-hycolor"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.10svn77682"

RPM_NAME = "texlive-hycolor-doc-2026.226.1.10svn77682-60.2.noarch.rpm"
RPM_HASH = "0d1494d812467aa7d67fecc3f68c10848f732b6a9bfc1c525bfbf8e53aa5c7fea78b6997827039ff3a046a954e61c30119057672c214c8ed47d933f146984aef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hycolor-doc-en \
texlive-hycolor-doc"

RDEPENDS:${PN} += ""

inherit rpm
