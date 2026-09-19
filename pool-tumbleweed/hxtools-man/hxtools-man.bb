SUMMARY = "Manual pages for the hxtools suite"
DESCRIPTION = "This package contains the manual pages for the binaries and scripts \
from hxtools."
LICENSE = "GPL-2.0-or-later & WTFPL"

PV = "20251011"

RPM_NAME = "hxtools-man-20251011-1.6.noarch.rpm"
RPM_HASH = "bb05397f2ce62909572090e3104c6dd473a7f7f7ef8d83944363a825a663de8cabba01f81126dbce4890130c5fa0d42a324ad3ff7e3cd1bb16ef6b204df54d56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hxtools-man"

RDEPENDS:${PN} += ""

inherit rpm
