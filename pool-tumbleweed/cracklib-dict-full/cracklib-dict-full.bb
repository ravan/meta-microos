SUMMARY = "A Password-Checking Library"
DESCRIPTION = "CrackLib tests passwords to determine whether they match certain \
security-oriented characteristics. You can use CrackLib to stop users \
from choosing passwords that are easy to guess."
LICENSE = "LGPL-2.1-only"

PV = "2.8.12"

RPM_NAME = "cracklib-dict-full-2.8.12-66.19.aarch64.rpm"
RPM_HASH = "e01fb82daf12cb8a62a6414d41612401cdfa3194c25e99547790bd0de5a882b903ffec276781760bb2ebf2cc0b47f4e522c492c719fa94fea6cac7ae31da33d4"

RPROVIDES:${PN} += "cracklib-/usr/share/cracklib/pw-dict.pwd \
cracklib-dict \
cracklib-dict-full"

RDEPENDS:${PN} += ""

inherit rpm
