SUMMARY = "Yet another graphical process/system monitor"
DESCRIPTION = "A cross-platform graphical process/system monitor with a \
customizable interface and a multitude of features."
LICENSE = "Apache-2.0 & MIT"

PV = "0.14.7"

RPM_NAME = "bottom-0.14.7-1.2.aarch64.rpm"
RPM_HASH = "8f0559f37b75782007dbd7a24756298d59f4c771c3453b3c82b7bb0331d79e230943a2a5ef486c3cb0c0295f112f844ab9feaa0715e548d9b38046c44c70d114"

RPROVIDES:${PN} += "bottom"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
