SUMMARY = "Library to Clean Up and Pretty-print HTML, XHTML or XML Markup"
DESCRIPTION = "TidyLib is a library for cleaning up and pretty printing HTML, XHTML and XML \
markup in a variety of file encodings. For HTML variants, it can detect and \
report proprietary elements as well as many common coding errors, correct them \
and produce visually equivalent markup which is both compliant with W3C \
standards and works on most browsers. Furthermore, it can convert plain HTML \
into XHTML. For generic XML files, Tidy is limited to correcting basic \
well-formedness errors and pretty printing. \
 \
There is a commandline frontend for this library, contained in the package \
'tidy'."
LICENSE = "W3C"

PV = "1.04"

RPM_NAME = "libtidyp-1_04-0-1.04-16.38.aarch64.rpm"
RPM_HASH = "84246bdbf0d9536a0a8690f0675e1b4a8daa5b5aaf6e2fea53083c60c4cb62cd0bd5eb86c2cc161b0c287ca914e3368f35b58a63a9d17dbd79d891fac6ce13b4"

RPROVIDES:${PN} += "libtidyp-1-04-0 \
libtidyp-1.04.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
