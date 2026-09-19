SUMMARY = "Etrophy Dynamic Libraries"
DESCRIPTION = "Etrophy is core EFL (Enlightenment Foundation Libraries) library to handle various data types."
LICENSE = "BSD-2-Clause"

PV = "0.5.1"

RPM_NAME = "libetrophy0-0.5.1-8.38.aarch64.rpm"
RPM_HASH = "559f0985620f3be5ec9c1b459d98ac4f535fafadd6dd556c04445c4a9cf551bf789bdbb181a2dd275dc128f44fd07f977288dc642a827925b0938a6fe78179c7"

RPROVIDES:${PN} += "libetrophy.so.0 \
libetrophy0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libecore-file.so.1 \
libecore.so.1 \
libeet.so.1 \
libeina.so.1 \
libelementary.so.1 \
libevas.so.1"

inherit rpm
