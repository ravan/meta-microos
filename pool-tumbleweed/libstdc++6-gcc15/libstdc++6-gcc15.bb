SUMMARY = "The standard C++ shared library"
DESCRIPTION = "The standard C++ library, needed for dynamically linked C++ programs."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "15.3.0+git11272"

RPM_NAME = "libstdc++6-gcc15-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "646b8b9b4552d24b0fcc6a21743daead9e19fa34ad389ff7a63d1d12858a7159f7ef2b0a2609a05d5fbc5dca7795349b895b31979361770fd5fa6bb9f80322a2"

RPROVIDES:${PN} += "libstdc++.so.6 \
libstdc++6 \
libstdc++6-gcc15"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
