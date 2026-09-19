SUMMARY = "Development files for KNightTime"
DESCRIPTION = "Development files for KNightTime,  a helper for dark-light day cycles."
LICENSE = "LGPL-2.1-or-later"

PV = "6.7.5"

RPM_NAME = "knighttime6-devel-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "0643e77f9c385d41e1b93a1b1e3229614af19def1839d20ce1aee297680a901cbe11f91c8371dc6be574239f1c2801f79d4dd24149216eace173823c1be0d8aa"

RPROVIDES:${PN} += "cmake-KNightTime \
knighttime6-devel"

RDEPENDS:${PN} += "libKNightTime0"

inherit rpm
