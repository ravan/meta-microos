SUMMARY = "Parse Perl string literals and string-literal-like things"
DESCRIPTION = "This Perl class parses Perl string literals and things that are reasonably \
like string literals. Its real reason for being is to find interpolated \
variables for Perl::Critic policies and similar code. \
 \
The parse is fairly straightforward, and a little poking around with \
_eg/pqldump_ should show how it normally goes. \
 \
But there is at least one quote-like thing that probably needs some \
explanation."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.24.0"

RPM_NAME = "perl-PPIx-QuoteLike-0.24.0-1.3.noarch.rpm"
RPM_HASH = "9107350226b2a34dc97314d043e5a943e15fdafe7061711a8a1eed4755cfd52f5ca6f077285a2688cc9a5c512b96ed16d206b4ba84dc37453867e793f09fcc21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-PPIx--QuoteLike \
perl-PPIx--QuoteLike--Constant \
perl-PPIx--QuoteLike--Dumper \
perl-PPIx--QuoteLike--Token \
perl-PPIx--QuoteLike--Token--Control \
perl-PPIx--QuoteLike--Token--Delimiter \
perl-PPIx--QuoteLike--Token--Interpolation \
perl-PPIx--QuoteLike--Token--String \
perl-PPIx--QuoteLike--Token--Structure \
perl-PPIx--QuoteLike--Token--Unknown \
perl-PPIx--QuoteLike--Token--Whitespace \
perl-PPIx--QuoteLike--Utils \
perl-PPIx-QuoteLike"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-PPI--Document \
perl-PPI--Dumper \
perl-Readonly"

inherit rpm
