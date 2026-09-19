SUMMARY = "Remote magnetic tape protocol server"
DESCRIPTION = "rmt is a program that can be used by e.g. star and ufsdump \
for accessing remote magnetic tape drives and files through an \
interprocess communication connection. \
 \
A tape client would launch something like ssh for the actual \
connection, and through that, have the rmt program executed."
LICENSE = "CDDL-1.0"

PV = "2024.03.21"

RPM_NAME = "schily-rmt-2024.03.21-53.5.aarch64.rpm"
RPM_HASH = "744a44a37864d7c6a7e0070336c28830fa7cc659d59f61143d01d07f301df67dc5ec066cc86a7ad7c531c17f45d253873e65052fadf348ef50a917a2a56e1627"

RPROVIDES:${PN} += "config-schily-rmt \
rmt \
schily-rmt \
star-rmt-/usr/bin/srmt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdeflt.so.1.0 \
libschily.so.2.0"

inherit rpm
