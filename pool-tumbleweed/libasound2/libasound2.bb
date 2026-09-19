SUMMARY = "Advanced Linux Sound Architecture Library"
DESCRIPTION = "This package contains the library for ALSA, Advanced Linux Sound \
Architecture."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.16.1"

RPM_NAME = "libasound2-1.2.16.1-2.1.aarch64.rpm"
RPM_HASH = "0635b6eec287f206621d1c6980bc7d7f725dedcbbb25205cdb900d53d44fad0d7aab4dec25e91403f4a8e506704f04a9eaa31752eee12b05829f15ba24857e47"

RPROVIDES:${PN} += "alsa-lib \
libasound.so.2 \
libasound2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
