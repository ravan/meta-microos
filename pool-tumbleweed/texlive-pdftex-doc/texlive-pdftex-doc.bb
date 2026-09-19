SUMMARY = "Documentation for texlive-pdftex"
DESCRIPTION = "This package includes the documentation for texlive-pdftex"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn77868"

RPM_NAME = "texlive-pdftex-doc-2026.226.svn77868-58.2.noarch.rpm"
RPM_HASH = "15b46bdf2e2ae4df022d65ae8d84d613d005bbb8de89627ffe5d5b0cf7279b573764da9114431fa4a6fd768ab32a273c4c756413e6d028bc7a799e9ca74854cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pdfetex.1 \
man-pdftex.1 \
texlive-pdftex-doc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/ruby"

inherit rpm
