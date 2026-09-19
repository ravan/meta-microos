SUMMARY = "Details of the native integer data type"
DESCRIPTION = "This module is about the native integer numerical data type. A native \
integer is one of the types of datum that can appear in the numeric part of \
a Perl scalar. This module supplies constants describing the native integer \
type. \
 \
There are actually two native integer representations: signed and unsigned. \
Both are handled by this module."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.7.0"

RPM_NAME = "perl-Data-Integer-0.7.0-1.7.noarch.rpm"
RPM_HASH = "c80909b134ebb2fcd7a5d6afa9af5946a63e542a73fe20d6fb5fbf25571b6ad33cf1c660dda167e2703a05da7900baa8ff1e21f0a55a791805f06135562f5546"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Integer \
perl-Data-Integer"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-parent"

inherit rpm
