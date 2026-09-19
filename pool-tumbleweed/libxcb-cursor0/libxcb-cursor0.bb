SUMMARY = "XCB cursor library (libxcursor port)"
DESCRIPTION = "The XCB util modules provide a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. \
 \
Included in this package is: \
 \
- cursor: port of libxcursor"
LICENSE = "MIT"

PV = "0.1.6"

RPM_NAME = "libxcb-cursor0-0.1.6-1.5.aarch64.rpm"
RPM_HASH = "b8ca252d0b7290cc6a9631f67c4823a11450b7c1632cee48725f6fb2d83d54eb56d353982c5ac206b7bdc5acd2c6ea4ec4ad547cc3f3ee5ba0722e6daf3e38e7"

RPROVIDES:${PN} += "libxcb-cursor.so.0 \
libxcb-cursor0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb-image.so.0 \
libxcb-render-util.so.0 \
libxcb-render.so.0 \
libxcb.so.1"

inherit rpm
