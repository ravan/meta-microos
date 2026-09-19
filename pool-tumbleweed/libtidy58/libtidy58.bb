SUMMARY = "Library to Clean Up and Pretty-print HTML, XHTML or XML Markup"
DESCRIPTION = "TidyLib is a library for cleaning up and pretty printing HTML, XHTML and XML \
markup in a variety of file encodings. For HTML variants, it can detect and \
report proprietary elements as well as many common coding errors, correct them \
and produce visually equivalent markup which is both compliant with W3C \
standards and works on most browsers. Furthermore, it can convert plain HTML \
into XHTML. For generic XML files, Tidy is limited to correcting basic \
well-formedness errors and pretty printing. \
 \
There is a command line frontend for this library, contained in the package \
'tidy'."
LICENSE = "W3C"

PV = "5.8.0"

RPM_NAME = "libtidy58-5.8.0-2.5.aarch64.rpm"
RPM_HASH = "9d063938a398071a55e81d5a95bc17c1aaa06e79910eb6fcd11109ddad45591d822544fa24f35525423084070d9dd2db3221db7cd0a8b1a4a9bad922669ed0f7"

RPROVIDES:${PN} += "libtidy.so.58 \
libtidy58"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
