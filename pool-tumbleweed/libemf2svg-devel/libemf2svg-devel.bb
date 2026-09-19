SUMMARY = "Development files for applications which will use libemf2svg"
DESCRIPTION = "The libemf2svg-devel package includes the header files, libraries, \
configuration files and development tools necessary for compiling and \
linking programs which will convert EMF files to SVG."
LICENSE = "GPL-2.0-only"

PV = "1.1.0"

RPM_NAME = "libemf2svg-devel-1.1.0-2.26.aarch64.rpm"
RPM_HASH = "f5ceb06f4be95353c3e603140cb4b2693c6e0a6d30dfddbf11c76b6cc03b1730451c13c0e0b1e39b2edab4da74e57e0729ca8b7549ffad4afef5751fa2a8a934"

RPROVIDES:${PN} += "libemf2svg-devel"

RDEPENDS:${PN} += "libemf2svg1"

inherit rpm
