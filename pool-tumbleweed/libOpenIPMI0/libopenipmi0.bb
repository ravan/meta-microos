SUMMARY = "User-level library for accessing IPMI services"
DESCRIPTION = "The user-level library that provides a higher-level abstraction of \
IPMI and generic services."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.37.13+git.1181df8"

RPM_NAME = "libOpenIPMI0-2.0.37.13+git.1181df8-1.6.aarch64.rpm"
RPM_HASH = "8d5dd8efc2e445889b3e69d690b4871406d515b33a30c7aa29cd2363f1d42fed8d75d269e2a4048979528eed239752e2d03dedd6e12a3097b944e88e073e129d"

RPROVIDES:${PN} += "libIPMIlanserv.so.0 \
libOpenIPMI.so.0 \
libOpenIPMI0 \
libOpenIPMIcmdlang.so.0 \
libOpenIPMIglib.so.0 \
libOpenIPMIposix.so.0 \
libOpenIPMIpthread.so.0 \
libOpenIPMIutils.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgdbm.so.6 \
libglib-2.0.so.0 \
libm.so.6"

inherit rpm
