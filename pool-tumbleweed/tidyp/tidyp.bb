SUMMARY = "Utility to Clean Up and Pretty-print HTML, XHTML or XML Markup"
DESCRIPTION = "Tidy is a commandline frontend to TidyLib which allows for cleaning up and \
pretty printing HTML, XHTML and XML markup in a variety of file encodings. For \
HTML variants, it can detect and report proprietary elements as well as many \
common coding errors, correct them and produce visually equivalent markup \
which is both compliant with W3C standards and works on most browsers. \
Furthermore, it can convert plain HTML to XHTML. For generic XML files, Tidy is \
limited to correcting basic well-formedness errors and pretty printing."
LICENSE = "W3C"

PV = "1.04"

RPM_NAME = "tidyp-1.04-16.38.aarch64.rpm"
RPM_HASH = "7759f98f650b51ac7c089c65dacbba35ae663142fec8dcb2cea84be87b06d0d1c2a941f0ba1b5651f8157ae7aa8bd1c2f66935f27bc36b1a3d6d629b1ebd63f7"

RPROVIDES:${PN} += "tidyp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtidyp-1.04.so.0"

inherit rpm
