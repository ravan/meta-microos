SUMMARY = "XSL stylesheets for TEI XML"
DESCRIPTION = "Stylesheets to transform TEI XML documents (version p4 and p5) to HTML \
or to XSL Formatting Objects (FO). You can also produce LaTeX output. \
 \
Use it with xsltproc (part of libxslt), Saxon, or any other XSLT \
processor."
LICENSE = "LGPL-2.1+"

PV = "7.40.1"

RPM_NAME = "tei-xsl-stylesheets-7.40.1-1.25.noarch.rpm"
RPM_HASH = "f4b74795a4c032b9163a6db41a124c448263c9751927ad71d5a2e20798236faa059169cb04cf6885618cdd0c51619cdb214a238f766872360046ab586f96ab19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tei-xsl-stylesheets"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
