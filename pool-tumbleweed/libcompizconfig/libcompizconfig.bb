SUMMARY = "CompizConfig plugin required for CCSM"
DESCRIPTION = "CompizConfig plugin required for compizconfig-settings-manager."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "libcompizconfig-0.8.18-2.42.aarch64.rpm"
RPM_HASH = "64eab448c2eeb2915d64cea674f1f66493c4dcdb6224be478f7c8170ce994f44beec4e551098e65b6ce27bb2d0994da34a2ab9488d30c351a8dc3b1239583c47"

RPROVIDES:${PN} += "config-libcompizconfig \
libccp.so \
libcompizconfig \
libcompizconfig.so.0 \
libini.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
compiz \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libabsl-log-internal-check-op.so.2608.0.0 \
libabsl-log-internal-message.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libprotobuf.so.36.1.0 \
libstdc++.so.6 \
libutf8-range.so.36.1.0 \
libxml2.so.16"

inherit rpm
