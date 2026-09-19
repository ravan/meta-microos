SUMMARY = "Enable ULP on all processes"
DESCRIPTION = "This package adds libpulp.so into /etc/ld.so.preload to add livepatching capabilities into all processes in the system."
LICENSE = "MIT"

PV = "0.1"

RPM_NAME = "libpulp-load-default-0.1-1.6.noarch.rpm"
RPM_HASH = "9098f1e7ca96b22e755f83d5f5dc42f05ca8938dd82953ea0bf9bcadb8b1e5ecb09ccdc72c81005fc65b516ba5d150af794b3a2f54808b43374928011f1f5951"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libpulp-load-default"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
libpulp0"

inherit rpm
