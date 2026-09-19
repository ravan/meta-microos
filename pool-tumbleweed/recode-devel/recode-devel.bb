SUMMARY = "Character Set Converter"
DESCRIPTION = "Recode converts files between various character sets."
LICENSE = "LGPL-2.1-or-later"

PV = "3.7.15"

RPM_NAME = "recode-devel-3.7.15-2.5.aarch64.rpm"
RPM_HASH = "a0a8e765e4059890bd10bd420704bfda146e465127f1b13de8891c53c5dbf0008e92b9c30444c21017a758da5b5bb7144732b1b28b2a523370d7c42a0af16acd"

RPROVIDES:${PN} += "recode-devel"

RDEPENDS:${PN} += "librecode3"

inherit rpm
