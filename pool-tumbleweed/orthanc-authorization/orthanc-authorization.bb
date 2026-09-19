SUMMARY = "Authorisation plugin for Orthanc"
DESCRIPTION = "Plugin for authorization"
LICENSE = "GPL-3.0-or-later"

PV = "0.12.0"

RPM_NAME = "orthanc-authorization-0.12.0-1.1.aarch64.rpm"
RPM_HASH = "3fb89ba8b326b8514eb271d63bda4d5f5db59b6c2e1f302526d03ac26fbe7f45463130d338131e71011df4ec99b7f7aa96de5f812b12a92afb5c5f81861d98ce"

RPROVIDES:${PN} += "libOrthancAuthorization.so.0.12.0 \
orthanc-authorization"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.91.0 \
libboost-iostreams.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libjsoncpp.so.27 \
libstdc++.so.6 \
orthanc"

inherit rpm
