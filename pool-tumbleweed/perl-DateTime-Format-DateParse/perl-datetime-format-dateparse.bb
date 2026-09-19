SUMMARY = "Parses Date::Parse compatible formats"
DESCRIPTION = "This module is a compatibility wrapper around Date::Parse. \
 \
  Author:	Joshua Hoblitt (JHOBLITT) <jhoblitt@cpan.org>"
LICENSE = "GPL-2.0 | Artistic-1.0"

PV = "0.05"

RPM_NAME = "perl-DateTime-Format-DateParse-0.05-22.40.noarch.rpm"
RPM_HASH = "e093eb827099e394ee2d62b9dd317ff3e0ceae7fa2e83c369dacf4dc57cf3118d6cbea775487a1931b92510047fb6f9aeee04af4f21c27a2f2a929d8068adb27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Format--DateParse \
perl-DateTime-Format-DateParse"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Date--Parse \
perl-DateTime \
perl-DateTime--Locale \
perl-DateTime--TimeZone \
perl-Time--Zone"

inherit rpm
