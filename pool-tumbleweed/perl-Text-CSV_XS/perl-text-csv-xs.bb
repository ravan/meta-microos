SUMMARY = "Comma-Separated Values manipulation routines"
DESCRIPTION = "Text::CSV_XS provides facilities for the composition and decomposition of \
comma-separated values. An instance of the Text::CSV_XS class will combine \
fields into a 'CSV' string and parse a 'CSV' string into fields. \
 \
The module accepts either strings or files as input and support the use of \
user-specified characters for delimiters, separators, and escapes."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.640.0"

RPM_NAME = "perl-Text-CSV_XS-1.640.0-1.4.aarch64.rpm"
RPM_HASH = "8a5238b19934bcb45234df4e920c78f093f86e4f10ade4ca14d67ed41b67dba3ac9ad9347184332648b337a8ad4dbe807e2277002aa9a9e24beda9c0a30f0054"

RPROVIDES:${PN} += "perl-Text--CSV-XS \
perl-Text-CSV-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
