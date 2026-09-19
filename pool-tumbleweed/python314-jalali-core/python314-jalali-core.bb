SUMMARY = "a Gregorian to Jalali and inverse date convertor"
DESCRIPTION = "a Gregorian to Jalali and inverse date convertor"
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.0"

RPM_NAME = "python314-jalali-core-1.0.0-1.9.noarch.rpm"
RPM_HASH = "c9c56ffa42d324d7fe641405156916f8a5c107e9725c1aef48f872456396e366ef4522df5c68dd5a49f761b2466cd3d7109d3e6fcc099031047ef558a2d6ad3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jalali-core \
python314-jalali-core \
python3dist-jalali-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm
