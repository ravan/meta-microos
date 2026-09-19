SUMMARY = "Documentation for texlive-jnuexam"
DESCRIPTION = "This package includes the documentation for texlive-jnuexam"
LICENSE = "LPPL-1.0"

PV = "2026.226.2024fsvn71883"

RPM_NAME = "texlive-jnuexam-doc-2026.226.2024fsvn71883-63.2.noarch.rpm"
RPM_HASH = "4c2c1b2ad362d022ddfc5e864188ee5497f0665c867f506e83036bfb00c7719e3e1294bff52335f03619674d22e59739b95bb65d99f8f2aaf78958415261c9d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-jnuexam-doc-zh \
texlive-jnuexam-doc"

RDEPENDS:${PN} += ""

inherit rpm
