SUMMARY = "Utility library for fcitx5"
DESCRIPTION = "This package provides utility libraries for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.17"

RPM_NAME = "libFcitx5Utils2-5.1.17-1.7.aarch64.rpm"
RPM_HASH = "1f82000cce36976116364e47fd98d15cae2e324bfd13df75e85df95178852910cc93d680f61b1a06f73fddeca11f5a0fe54066d77f0b3626d9d284e55b8f7e0c"

RPROVIDES:${PN} += "libFcitx5Utils.so.2 \
libFcitx5Utils1 \
libFcitx5Utils2 \
libfcitx-utils0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libsystemd.so.0"

inherit rpm
