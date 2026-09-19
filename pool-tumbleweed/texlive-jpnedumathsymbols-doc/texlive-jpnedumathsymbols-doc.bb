SUMMARY = "Documentation for texlive-jpnedumathsymbols"
DESCRIPTION = "This package includes the documentation for texlive-jpnedumathsymbols"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn72959"

RPM_NAME = "texlive-jpnedumathsymbols-doc-2026.226.1.3svn72959-63.2.noarch.rpm"
RPM_HASH = "04f0e8ea363ec7d32d701c604c4f94391564678e5870cd428d6f170f93cb7c8b92693bf0ca78d3dd38e46cc9e1882279c706d18cc03d69d92e6db85742a1177e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ja) \
locale(texlive-jpnedumathsymbols-doc-en \
texlive-jpnedumathsymbols-doc"

RDEPENDS:${PN} += ""

inherit rpm
