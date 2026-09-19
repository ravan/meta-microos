SUMMARY = "Lists of reserved barewords and symbol names"
DESCRIPTION = "'B::Keywords' supplies several arrays of exportable keywords: '@Scalars', \
'@Arrays', '@Hashes', '@Filehandles', '@Symbols', '@Functions', \
'@Barewords', '@BarewordsExtra', '@TieIOMethods', '@UNIVERSALMethods' and \
'@ExporterSymbols'. \
 \
The '@Symbols' array includes the contents of each of '@Scalars', \
'@Arrays', '@Hashes', '@Functions' and '@Filehandles'. \
 \
Similarly, '@Barewords' adds a few non-function keywords and operators to \
the '@Functions' array. \
 \
'@BarewordsExtra' adds a few barewords which are not in keywords.h. \
 \
All additions and modifications are welcome. \
 \
The perl parser uses a static list of keywords from _regen/keywords.pl_ \
which constitutes the strict list of keywords @Functions and @Barewords, \
though some @Functions are not functions in the strict sense. Several \
library functions use more special symbols, handles and methods."
LICENSE = "Artistic-1.0 | GPL-2.0-only"

PV = "1.290.0"

RPM_NAME = "perl-B-Keywords-1.290.0-1.5.noarch.rpm"
RPM_HASH = "5bc79a0b4f5e7017e68d6a9875286b94637a6091aeb3399c431130c0e839c759aeb3fba58ceb1bffe649daa038b7cc204aae6bbf94127198193579ee8a9c93af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-B--Keywords \
perl-B-Keywords"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
