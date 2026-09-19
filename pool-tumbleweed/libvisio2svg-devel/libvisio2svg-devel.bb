SUMMARY = "Development Files for applications which will use libvisio2svg"
DESCRIPTION = "The libvisio2svg-devel package includes the header files, libraries, \
configuration files and development tools necessary for compiling and \
linking programs which will convert Visio files to SVG."
LICENSE = "GPL-2.0-only"

PV = "0.5.5"

RPM_NAME = "libvisio2svg-devel-0.5.5-3.24.aarch64.rpm"
RPM_HASH = "2d70c814a9e073e64bc4972f6a429c40d041b99b651edfa1bafd507a9eb7107e74fafaa0577786120f90ecd9611aa1fe930020a18ea2a60a8658a7b133659320"

RPROVIDES:${PN} += "libvisio2svg-devel"

RDEPENDS:${PN} += "libvisio2svg0"

inherit rpm
