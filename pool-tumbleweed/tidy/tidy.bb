SUMMARY = "Utility to Clean Up and Pretty-print HTML, XHTML or XML Markup"
DESCRIPTION = "Tidy is a command line frontend to TidyLib which allows for cleaning up and \
pretty printing HTML, XHTML and XML markup in a variety of file encodings. For \
HTML variants, it can detect and report proprietary elements as well as many \
common coding errors, correct them and produce visually equivalent markup \
which is both compliant with W3C standards and works on most browsers. \
Furthermore, it can convert plain HTML to XHTML. For generic XML files, Tidy is \
limited to correcting basic well-formedness errors and pretty printing."
LICENSE = "W3C"

PV = "5.8.0"

RPM_NAME = "tidy-5.8.0-2.5.aarch64.rpm"
RPM_HASH = "c12a8ed6263bd4974cfe544b0890e054d36adca173d5010f8e2a58ae07c4125e9765c9e8b0f409cdf169cc4ea972da89848bcdfb992ae628deb89cbaa2316e79"

RPROVIDES:${PN} += "tidy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtidy.so.58"

inherit rpm
