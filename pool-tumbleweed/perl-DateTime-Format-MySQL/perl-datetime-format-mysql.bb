SUMMARY = "Parse and format MySQL dates and times"
DESCRIPTION = "This module understands the formats used by MySQL for its DATE, DATETIME, \
TIME, and TIMESTAMP data types. It can be used to parse these formats in \
order to create DateTime objects, and it can take a DateTime object and \
produce a string representing it in the MySQL format."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.0800"

RPM_NAME = "perl-DateTime-Format-MySQL-0.0800-1.15.noarch.rpm"
RPM_HASH = "d19bd5fc3a8d97ff7b4c94c227fbfeacffeb6f1df0a02116ce833384026d0dbc902ab3a0e6a0fd91fa88aea0ddb191ac928c525f1276f2820ceb8232a5631576"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Format--MySQL \
perl-DateTime-Format-MySQL"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-DateTime \
perl-DateTime--Format--Builder"

inherit rpm
