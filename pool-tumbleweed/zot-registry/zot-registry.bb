SUMMARY = "Scale-out production-ready vendor-neutral OCI-native container image registry"
DESCRIPTION = "Production-ready vendor-neutral OCI image registry - images stored in OCI image \
format, distribution specification on-the-wire, that's it!"
LICENSE = "Apache-2.0"

PV = "2.1.20"

RPM_NAME = "zot-registry-2.1.20-1.1.aarch64.rpm"
RPM_HASH = "1596ed7e5b429c80dec8a9b696fc2a5ceaad0ce6253cab4ce15c8611cec0986f15d84f40cc7ccb802c3ae17e6ec51dad012018c55ed492174c830ad94dc4378b"

RPROVIDES:${PN} += "config-zot-registry \
group-zot \
user-zot \
zot-registry"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
