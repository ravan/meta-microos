SUMMARY = "Printf extensions"
DESCRIPTION = "This module inserts values into (format) strings. It provides 'printf()' \
and 'sprintf()' alternatives via both an object oriented and a functional \
interface. \
 \
Read in the DETAILS chapter below, why this module provides a better \
alternative for 'printf()'. Also, some extended *examples* can be found \
down there. Take a look at them first, when you start using this module!"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.20.0"

RPM_NAME = "perl-String-Print-1.20.0-1.5.noarch.rpm"
RPM_HASH = "5f083944ecabb00291c82549c63a35146674f2a6615ae589c01820277aeeaf5bba873b3fb8263853d2d27ce4a3bb7df860add6390f915423894bf649b6d0a0d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--Print \
perl-String-Print"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Date--Parse \
perl-HTML--Entities \
perl-Test--More \
perl-Unicode--GCString"

inherit rpm
