SUMMARY = "Qt 5 Concurrent Library"
DESCRIPTION = "The QtConcurrent namespace provides high-level APIs that help write \
multi-threaded programs without using low-level threading primitives \
such as mutexes, read-write locks, wait conditions, or semaphores. \
Programs written with QtConcurrent automatically adjust the number of \
threads used according to the number of processor cores available. \
 \
QtConcurrent includes functional programming style APIs for parallel \
list processing, including a MapReduce and FilterReduce \
implementation for shared-memory (non-distributed) systems, and \
classes for managing asynchronous computations in GUI applications."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5Concurrent5-5.15.19+kde96-1.3.aarch64.rpm"
RPM_HASH = "8e827c88000af233f3a5b862d9507aca31ffb09e231566cfff56e27d841a62e049d61447275057469de0f6aa5d4763f86fb46ec9b920453c3bed4228b8d3f275"

RPROVIDES:${PN} += "libQt5Concurrent.so.5 \
libQt5Concurrent5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
