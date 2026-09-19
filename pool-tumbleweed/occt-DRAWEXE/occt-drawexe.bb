SUMMARY = "Development files for occt"
DESCRIPTION = "This package contains the OpenCASCADE DRAWEXE test \
harness executable."
LICENSE = "LGPL-2.1-only-with-OCCT-exception-1.0"

PV = "7.9.3"

RPM_NAME = "occt-DRAWEXE-7.9.3-1.4.aarch64.rpm"
RPM_HASH = "65d44e6833cffcce65c91353e33d6cbd242edf484e5307dac787bb835a93359048f35acc03571bc161b84d4fe4df0242ecda3418d3013ccff8d758974668c706"

RPROVIDES:${PN} += "occt-DRAWEXE"

RDEPENDS:${PN} += "/usr/bin/bash \
libTKDraw.so.7.9.3 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
