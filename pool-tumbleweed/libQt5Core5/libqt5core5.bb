SUMMARY = "Qt 5 Core Library"
DESCRIPTION = "The Qt 5 Core library. It adds these features to C++: \
 \
* a mechanism for object communication called signals and slots \
* queryable and designable object properties \
* hierarchical and queryable object trees that organize \
* object ownership in a natural way with guarded pointers (QPointer) \
* a dynamic cast that works across library boundaries"
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5Core5-5.15.19+kde96-1.3.aarch64.rpm"
RPM_HASH = "f953739e842fe704c6edb7a59e8b4bfe7fb35c2ab5df871466efd5e4836b3322107853b14ef6b444f1eec1fb0b252a968800dba53f9f459830eee24a2bf979ec"

RPROVIDES:${PN} += "libQt5Core.so.5 \
libQt5Core5 \
libqt5-qtbase"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdouble-conversion.so.3 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libicui18n.so.78 \
libicuuc.so.78 \
libm.so.6 \
libpcre2-16.so.0 \
libstdc++.so.6 \
libsystemd.so.0 \
libz.so.1 \
libzstd.so.1"

inherit rpm
