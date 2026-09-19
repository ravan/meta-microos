SUMMARY = "Parallelizing Multi-Protocol Utility for Downloading Files"
DESCRIPTION = "aria2 is a utility for downloading files. It has a segmented \
downloading engine in its core. It can download one file from \
multiple URLs or multiple connections from one URL. This can be used \
to speed up downloads with certain networks. The engine in was \
implemented in a single-thread model. \
 \
aria2 currently supports HTTP, FTP, and BitTorrent."
LICENSE = "LicenseRef-SUSE-GPL-2.0-with-openssl-exception"

PV = "1.37.0"

RPM_NAME = "aria2-1.37.0-2.2.aarch64.rpm"
RPM_HASH = "89578c0bccf326133077015c5f2a2eb15da5cf7062d4040f070d303cd6dff9593af4e78d3b0e7cae316781902e52b2d472596fc8d7c3184462621496ab99b3e1"

RPROVIDES:${PN} += "aria2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaria2.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
