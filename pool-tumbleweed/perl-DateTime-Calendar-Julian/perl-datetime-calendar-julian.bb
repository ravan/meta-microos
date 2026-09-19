SUMMARY = "Dates in the Julian calendar"
DESCRIPTION = "DateTime::Calendar::Julian implements the Julian Calendar. This module \
implements all methods of DateTime; see the DateTime(3) manpage for all \
methods."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.107"

RPM_NAME = "perl-DateTime-Calendar-Julian-0.107-1.23.noarch.rpm"
RPM_HASH = "3844c90ef4a8eea67d684bb5d7936579d20984ca307944a01e1f67d1b518f934ef37ce1e2b0402cfcc3c4682094e500f65d144ed07d4304abd80ecd43f907bb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Calendar--Julian \
perl-DateTime-Calendar-Julian"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-DateTime"

inherit rpm
