SUMMARY = "Baloo Engine library"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains Baloo's Engine library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "6.30.0"

RPM_NAME = "libKF6BalooEngine6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "9fd5158dea783acaf1d9513bec70a686eac696079d4e05035bab53e021c49193cbdf12f7efbcc0dff2647a6b575b210e3eebadea68af083e89f6432b5561f0a8"

RPROVIDES:${PN} += "libKF6BalooEngine.so.6 \
libKF6BalooEngine6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6I18n.so.6 \
libQt6Core.so.6 \
libc.so.6 \
liblmdb-0.9.35.so \
libstdc++.so.6"

inherit rpm
