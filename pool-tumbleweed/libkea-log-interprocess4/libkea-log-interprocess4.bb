SUMMARY = "Kea DHCP log interprocess library"
DESCRIPTION = "The log-interprocess library facilitates the transfer of logging messages \
between the different Kea processes."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "libkea-log-interprocess4-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "362d62ab876dfd3315e5d8f6d61818ddb6c21471a3b52eaa07dbd9128048fac5a845c0f7f1f36d8dc27e3c89f9b71509b4ecc5eafea054e992d2281d304cb663"

RPROVIDES:${PN} += "libkea-log-interprocess.so.4 \
libkea-log-interprocess4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-exceptions.so.55 \
libstdc++.so.6"

inherit rpm
