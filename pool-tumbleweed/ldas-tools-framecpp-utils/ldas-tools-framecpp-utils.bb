SUMMARY = "Command line tools for use with framecpp"
DESCRIPTION = "This package provides command line tools  for use with framecpp."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.4"

RPM_NAME = "ldas-tools-framecpp-utils-3.0.4-2.7.aarch64.rpm"
RPM_HASH = "9aea40e4e8af553091f91b41132e8444de845e9afd5e0076c4d05b53d92e9c2f0924958197293fa6f4fe9215c63bdb191b5b8d4fd449557d676fff820052429f"

RPROVIDES:${PN} += "ldas-tools-framecpp-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.91.0 \
libboost-program-options.so.1.91.0 \
libc.so.6 \
libframecpp.so.16 \
libframecpp3.so.8 \
libframecpp4.so.10 \
libframecpp6.so.10 \
libframecpp7.so.6 \
libframecpp8.so.11 \
libframecpp9.so.0 \
libframecppcmn.so.12 \
libgcc-s.so.1 \
libldastoolsal.so.7 \
libstdc++.so.6"

inherit rpm
