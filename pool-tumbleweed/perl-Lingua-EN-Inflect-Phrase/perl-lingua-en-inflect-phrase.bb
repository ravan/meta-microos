SUMMARY = "Inflect short English Phrases"
DESCRIPTION = "Attempts to pluralize or singularize short English phrases. \
 \
Does not throw exceptions at present, if you attempt to pluralize an \
already pluralized phrase, it will leave it unchanged (and vice versa.) \
 \
The behavior of this module is subject to change as I tweak the heuristics, \
as some things get fixed others might regress. The processing of natural \
language is a messy business. \
 \
If it doesn't work, please email or submit to RT the example you tried, and \
I'll try to fix it."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.20"

RPM_NAME = "perl-Lingua-EN-Inflect-Phrase-0.20-1.33.noarch.rpm"
RPM_HASH = "0f975984f4aa789558cbc1d5bcd71cc12a27326d290179cfd56aae42e6c58881f9cab2685ebdc67b3ee233cb8e03d6b635e18a3b878b9006f5c6c5b158c7434b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--EN--Inflect--Phrase \
perl-Lingua-EN-Inflect-Phrase"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Lingua--EN--FindNumber \
perl-Lingua--EN--Inflect \
perl-Lingua--EN--Inflect--Number \
perl-Lingua--EN--Number--IsOrdinal \
perl-Lingua--EN--Tagger"

inherit rpm
