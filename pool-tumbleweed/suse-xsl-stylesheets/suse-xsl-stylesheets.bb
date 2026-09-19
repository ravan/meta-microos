SUMMARY = "SUSE-Branded Stylesheets for DocBook"
DESCRIPTION = "These are SUSE-branded XSLT 1.0 stylesheets for DocBook 4 and 5 that are be used \
to create the HTML, PDF, and EPUB versions of SUSE documentation. These \
stylesheets are based on the original DocBook XSLT 1.0 stylesheets."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.95.40"

RPM_NAME = "suse-xsl-stylesheets-2.95.40-1.1.noarch.rpm"
RPM_HASH = "0b9a0ecc36d37449e227f8adff7df18f23ef9ab6e82eff0fd4c5fe57446a77963ba230a8b437146107c3060909b8519f30df0def2f642a48cefbd4e7725f65aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-suse-xsl-stylesheets \
suse-xsl-stylesheets"

RDEPENDS:${PN} += "/usr/bin/sh \
docbook-4 \
docbook-5 \
docbook-xsl-stylesheets \
docbook5-xsl-stylesheets \
ghostscript-fonts-std \
google-noto-sans-jp-bold-fonts \
google-noto-sans-jp-regular-fonts \
google-noto-sans-kr-bold-fonts \
google-noto-sans-kr-regular-fonts \
google-noto-sans-sc-bold-fonts \
google-noto-sans-sc-regular-fonts \
google-noto-sans-tc-bold-fonts \
google-noto-sans-tc-regular-fonts \
libxslt-tools \
sgml-skel"

inherit rpm
