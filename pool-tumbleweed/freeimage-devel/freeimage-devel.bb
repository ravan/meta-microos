SUMMARY = "Development Files for FreeImage"
DESCRIPTION = "This package provides development libraries and headers needed to build \
software using FreeImage."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "3.18.0.1909"

RPM_NAME = "freeimage-devel-3.18.0.1909-2.17.aarch64.rpm"
RPM_HASH = "48c607986d5b280cb4050101077273f5a330f1347ca5286885ac53443aba23beeefc9863d96b026599ad292588f6d9b9d34745a1d53fc4dae133d3eb026dd5e5"

RPROVIDES:${PN} += "freeimage-devel \
libfreeimage-devel"

RDEPENDS:${PN} += "libfreeimage3 \
libfreeimageplus3"

inherit rpm
