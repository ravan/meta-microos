SUMMARY = "Programs for solving certain tasks in mathematical crystallography"
DESCRIPTION = "Carat is a computer package which handles enumeration, \
construction, recognition and comparison problems for \
crystallographic groups up to dimension 6. The name CARAT itself \
is an acronym for Crystallographic AlgoRithms And Tables."
LICENSE = "GPL-2.0-only"

PV = "2.1b1+g132.21bfdb5"

RPM_NAME = "carat-2.1b1+g132.21bfdb5-1.10.aarch64.rpm"
RPM_HASH = "12f529e3df628d330d768a50aeb351a06ccdffc6a75f2ccbbb552bf3f73e971c9f7a59a468839fe220ec1d4e21ecb76ec96e228515fe5e25ae4cce9fb6e28988"

RPROVIDES:${PN} += "carat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
