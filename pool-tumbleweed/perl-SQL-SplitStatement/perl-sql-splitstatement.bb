SUMMARY = "Split any SQL code into atomic statements"
DESCRIPTION = "This is a simple module which tries to split any SQL code, even including \
non-standard extensions (for the details see the SUPPORTED DBMSs section \
below), into the atomic statements it is composed of. \
 \
The logic used to split the SQL code is more sophisticated than a raw \
'split' on the ';' (semicolon) character: first, various different \
statement terminator _tokens_ are recognized (see below for the list), then \
this module is able to correctly handle the presence of said tokens inside \
identifiers, values, comments, 'BEGIN ... END' blocks (even nested), \
_dollar-quoted_ strings, MySQL custom 'DELIMITER's, procedural code etc., \
as (partially) exemplified in the SYNOPSIS above. \
 \
Consider however that this is by no means a validating parser (technically \
speaking, it's just a _context-sensitive tokenizer_). It should rather be \
seen as an in-progress _heuristic_ approach, which will gradually improve \
as test cases will be reported. This also means that, except for the \
LIMITATIONS detailed below, there is no known (to the author) SQL code the \
most current release of this module can't correctly split. \
 \
The test suite bundled with the distribution (which now includes the \
popular _Sakila_ and _Pagila_ sample db schemata, as detailed in the \
SHOWCASE section below) should give you an idea of the capabilities of this \
module \
 \
If your atomic statements are to be fed to a DBMS, you are encouraged to \
use DBIx::MultiStatementDo instead, which uses this module and also \
(optionally) offers automatic transactions support, so that you'll have the \
_all-or-nothing_ behavior you would probably want."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.00023"

RPM_NAME = "perl-SQL-SplitStatement-1.00023-1.25.noarch.rpm"
RPM_HASH = "7b6eedfd27ce9611be80d61f7e67b2a244bf0c6c8cba844c979e710bdbcef438ded84271bfc5d09393068b19eb9c1bf5ae31d3e170d616575d6817ff9221884b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-SQL--SplitStatement \
perl-SQL--SplitStatement--Tokenizer \
perl-SQL-SplitStatement"

RDEPENDS:${PN} += "/usr/bin/env \
perl--MODULE-COMPAT-5.44.0 \
perl-Class--Accessor--Fast \
perl-List--MoreUtils \
perl-Regexp--Common"

inherit rpm
