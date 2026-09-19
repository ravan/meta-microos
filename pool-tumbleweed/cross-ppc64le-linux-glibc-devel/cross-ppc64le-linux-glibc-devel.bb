SUMMARY = "Linux headers for ppc64le userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for ppc64le, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "7.2"

RPM_NAME = "cross-ppc64le-linux-glibc-devel-7.2-2.1.noarch.rpm"
RPM_HASH = "b9328407c52b451a4d56326764d390cfcb9ffb13bd5dad42c0bad110a37bc0b258a5fd843fcc8b92271adb1209624dd55bb49d47ff2cebdbca6d033ebb34dbd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-ppc64le-linux-glibc-devel"

RDEPENDS:${PN} += ""

inherit rpm
