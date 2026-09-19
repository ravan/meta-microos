SUMMARY = "Ghostscript fonts imported to groff for use with grops"
DESCRIPTION = "A version of PostScript® driver for Groff to support characters outside ISO Latin 1 character set."
LICENSE = "GPL-2.0-only"

PV = "1.22.2"

RPM_NAME = "ghostscript-fonts-grops-1.22.2-11.8.noarch.rpm"
RPM_HASH = "9e53793cb3f5a9267a323de92e38d7b0e39920e49cbfb8725b417274acba1a03a67f9f89b3660b55f4e738aaf8fa418cfed121bc596753932d7bf3209e00c03e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-ghostscript-fonts-grops \
ghostscript-fonts-grops \
locale-groff-pl"

RDEPENDS:${PN} += "/usr/bin/sh \
groff"

inherit rpm
