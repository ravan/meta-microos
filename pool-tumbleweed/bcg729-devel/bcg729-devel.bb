SUMMARY = "Development files for libbcg729"
DESCRIPTION = "This package includes the files necessary for compiling and linking \
application which will use libbcg729."
LICENSE = "GPL-3.0-only"

PV = "1.1.2"

RPM_NAME = "bcg729-devel-1.1.2-1.2.aarch64.rpm"
RPM_HASH = "b6871bcd7f36178e6e697ce0eeb9cc3dfea0ba3efe0234091a543c45baedfadc5ca24aba9cbf4ae6158104ac4c9fdffac7efdc3b17803b23dd650832e7edc14d"

RPROVIDES:${PN} += "bcg729-devel \
pkgconfig-libbcg729"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbcg729-0"

inherit rpm
