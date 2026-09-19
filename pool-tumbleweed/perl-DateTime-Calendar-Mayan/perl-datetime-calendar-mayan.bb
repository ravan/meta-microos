SUMMARY = "The Mayan Long Count, Haab, and Tzolkin calendars"
DESCRIPTION = "An implementation of the Mayan Long Count, Haab, and Tzolkin calendars as \
defined in 'Calendrical Calculations The Millennium Edition'. Supplemented by \
'Frequently Asked Questions about Calendars'. \
 \
Author: \
------- \
    Joshua Hoblitt <jhoblitt@cpan.org>"
LICENSE = "Artistic-1.0"

PV = "0.0601"

RPM_NAME = "perl-DateTime-Calendar-Mayan-0.0601-21.7.aarch64.rpm"
RPM_HASH = "8dce7f553015ab2e4e1b02185e2731803de063b03f078f8d4110854c9760182adb19fc75c3bebbfbcca1b7af18effa1a6702fa03743a23ef57631d1f541b25ba"

RPROVIDES:${PN} += "perl-DateTime--Calendar--Mayan \
perl-DateTime-Calendar-Mayan"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-DateTime \
perl-Params--Validate"

inherit rpm
