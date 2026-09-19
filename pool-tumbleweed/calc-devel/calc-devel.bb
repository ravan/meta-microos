SUMMARY = "Development files for libcalc"
DESCRIPTION = "Part of the calc release consists of an arbitrary precision math link \
library.  This link library is used by the calc program to perform its \
own calculations.  If you wish, you can ignore the calc program entirely \
and call the arbitrary precision math routines from your own C programs. \
 \
This package contains the files needed for building programs that use \
this library."
LICENSE = "LGPL-2.1-only"

PV = "2.17.0.0"

RPM_NAME = "calc-devel-2.17.0.0-1.2.aarch64.rpm"
RPM_HASH = "85541807e834df04792204fe250906e55c81d8de5c2dcf206b445d6285a2204f1c2b08b243dc0cc17d07eb979ed74ca7653e967534d8be92b74ecc5e548c56fc"

RPROVIDES:${PN} += "calc-devel"

RDEPENDS:${PN} += "libcalc2-17-0-0"

inherit rpm
