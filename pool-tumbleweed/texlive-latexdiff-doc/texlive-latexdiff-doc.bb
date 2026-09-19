SUMMARY = "Documentation for texlive-latexdiff"
DESCRIPTION = "This package includes the documentation for texlive-latexdiff"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn77278"

RPM_NAME = "texlive-latexdiff-doc-2026.226.svn77278-61.2.noarch.rpm"
RPM_HASH = "ff23f63ab5f362b0e7c7d52ad2fe0a8c808cef51e92111c5b9e3a7204aa871b9b5459f8a2018d914b6467a846918a27d596868e6dc242293e5a4a98aecf73f09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-latexdiff-vc.1 \
man-latexdiff.1 \
man-latexrevise.1 \
texlive-latexdiff-doc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/python3.13"

inherit rpm
