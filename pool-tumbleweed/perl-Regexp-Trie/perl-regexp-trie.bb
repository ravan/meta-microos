SUMMARY = "Builds trie-ized regexp"
DESCRIPTION = "This module is a faster but simpler version of Regexp::Assemble or \
Regexp::Optimizer. It builds a trie-ized regexp as above. \
 \
This module is faster than Regexp::Assemble but you can only add literals. \
'a+b' is treated as 'a\\+b', not 'more than one a's followed by b'. \
 \
I wrote this module because I needed something faster than Regexp::Assemble \
and Regexp::Optimizer. If you need more minute control, use those instead."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.02"

RPM_NAME = "perl-Regexp-Trie-0.02-1.25.noarch.rpm"
RPM_HASH = "cea12a3bf586bb5cbcb5616741e2c7c0b783f37d10bcdf0d6ed7ead6d370e1def6c077d82318d1ac1be17f59f69907312250ebf6c4e5168efba997879933793d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Regexp--Trie \
perl-Regexp-Trie"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
