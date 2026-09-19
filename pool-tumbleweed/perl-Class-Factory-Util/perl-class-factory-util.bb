SUMMARY = "Provide utility methods for factory classes"
DESCRIPTION = "This module exports a method that is useful for factory classes."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.700.0"

RPM_NAME = "perl-Class-Factory-Util-1.700.0-1.9.noarch.rpm"
RPM_HASH = "fb32571ec524c4e9d8979898fdba998afc8cc7bae6a384c256f3e0ecc1f1fad3e8b2f496b4f18ba985da4eadeecf157a7187fddc186b4b70e0e79fa45a971b98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Factory--Util \
perl-Class-Factory-Util"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
