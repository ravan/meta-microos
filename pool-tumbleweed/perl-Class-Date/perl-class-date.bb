SUMMARY = "Class for easy date and time manipulation"
DESCRIPTION = "This module is intended to provide a general-purpose date and datetime type \
for perl. You have a Class::Date class for absolute date and datetime, and \
have a Class::Date::Rel class for relative dates. \
 \
You can use '+', '-', '<' and '>' operators as with native perl data types."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.1.17"

RPM_NAME = "perl-Class-Date-1.1.17-1.36.aarch64.rpm"
RPM_HASH = "84a056b374fed9eddff73a062e8c094faf5e0340c8a5d7a14ffd1461654ed16759a17b9682c41c7e2c9db844f243446781fe578515c63b39ac5015438b6fef58"

RPROVIDES:${PN} += "perl-Class--Date \
perl-Class--Date--Const \
perl-Class--Date--Invalid \
perl-Class--Date--Rel \
perl-Class-Date"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
