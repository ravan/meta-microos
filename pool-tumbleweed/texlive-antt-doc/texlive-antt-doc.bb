SUMMARY = "Documentation for texlive-antt"
DESCRIPTION = "This package includes the documentation for texlive-antt"
LICENSE = "LPPL-1.3c"

PV = "2026.226.2.08svn77682"

RPM_NAME = "texlive-antt-doc-2026.226.2.08svn77682-61.2.noarch.rpm"
RPM_HASH = "d7e597bb2a4e90d67313401f37863ef770258e9f68f448636e1c36346116657c8e94475d179d64d7f0b51331d6423d4388bd069c67c05035b0fe6eedda3ff32d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-antt-doc-en;pl \
texlive-antt-doc"

RDEPENDS:${PN} += ""

inherit rpm
