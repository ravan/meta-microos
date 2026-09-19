SUMMARY = "Documentation for texlive-ieejtran"
DESCRIPTION = "This package includes the documentation for texlive-ieejtran"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.19svn76790"

RPM_NAME = "texlive-ieejtran-doc-2026.226.0.0.19svn76790-60.2.noarch.rpm"
RPM_HASH = "beddfc77346a5787403cfc441d2e66b3abdaddc2ea59c8a9a72660c914797ea16491101bcdc7cee8744aefd84779ed80fff3ba5ce108174f480c2313f812f900"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ieejtran-doc-ja \
texlive-ieejtran-doc"

RDEPENDS:${PN} += ""

inherit rpm
