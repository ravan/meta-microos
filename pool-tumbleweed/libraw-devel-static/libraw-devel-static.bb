SUMMARY = "Library for reading RAW files obtained from digital photo cameras"
DESCRIPTION = "LibRaw is a library for reading RAW files obtained from digital photo \
cameras (CRW/CR2, NEF, RAF, DNG, and others). \
 \
LibRaw is based on the source codes of the dcraw utility, where part of \
drawbacks have already been eliminated and part will be fixed in future. \
 \
This package contains static libraries that applications can use to build \
against LibRaw. LibRaw does not provide dynamic libraries."
LICENSE = "CDDL-1.0 | LGPL-2.1-only"

PV = "0.22.2"

RPM_NAME = "libraw-devel-static-0.22.2-1.1.aarch64.rpm"
RPM_HASH = "f4f3ffdd1821855ccb6f61af8a4a5f33c3ec54a62ce2b8af11d5be7041b4bfab68729207377bf21beb17c1c6c0807d5b25ac848cef39f0f93dfc779d0805f045"

RPROVIDES:${PN} += "libraw-devel-static"

RDEPENDS:${PN} += "libraw-devel"

inherit rpm
