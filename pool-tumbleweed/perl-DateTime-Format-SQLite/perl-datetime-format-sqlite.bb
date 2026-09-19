SUMMARY = "Parse and format SQLite dates and times"
DESCRIPTION = "This module understands the formats used by SQLite for its 'date', \
'datetime' and 'time' functions. It can be used to parse these formats in \
order to create the DateTime manpage objects, and it can take a DateTime \
object and produce a timestring accepted by SQLite. \
 \
*NOTE:* SQLite does not have real date/time types but stores everything as \
strings. This module deals with the date/time strings as \
understood/returned by SQLite's 'date', 'time', 'datetime', 'julianday' and \
'strftime' SQL functions. You will usually want to store your dates in one \
of these formats."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.11"

RPM_NAME = "perl-DateTime-Format-SQLite-0.11-3.41.noarch.rpm"
RPM_HASH = "22e7961e35acb9e2b5dd83b9c594e92908de81cf053514bfae9d587919166b0753ee1e5891328548fbe8eab1e5d0a53a1b8136f69d8f27f13b86d9fb42255348"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Format--SQLite \
perl-DateTime-Format-SQLite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-DateTime \
perl-DateTime--Format--Builder"

inherit rpm
