SUMMARY = "Populates HTML Forms with data"
DESCRIPTION = "This module fills in an HTML form with data from a Perl data structure, \
allowing you to keep the HTML and Perl separate. \
 \
Here are two common use cases: \
 \
1. A user submits an HTML form without filling out a required field. You \
want to redisplay the form with all the previous data in it, to make it \
easy for the user to see and correct the error. \
 \
2. You have just retrieved a record from a database and need to display it \
in an HTML form."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.22"

RPM_NAME = "perl-HTML-FillInForm-2.22-1.24.noarch.rpm"
RPM_HASH = "4da345bf8563572b495dbaa3d1139269cc4f85727caca507f25252cf33bb4d73ea95e0af2e07b889c6ee318e94e76f06adfefa802afb5bcad5eedfea0b947641"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--FillInForm \
perl-HTML-FillInForm"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
