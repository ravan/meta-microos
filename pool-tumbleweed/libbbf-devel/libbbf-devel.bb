SUMMARY = "Development files for libbbf"
DESCRIPTION = "Bound Book Format (.bbf) is a high-performance binary container designed \
specifically for digital comic books and manga. Unlike CBR/CBZ, BBF is built \
for DirectSotrage/mmap, easy integrity checks, and mixed-codec \
containerization. \
 \
This package contains the files needed to build using libbbf."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "libbbf-devel-3.0.1-1.3.aarch64.rpm"
RPM_HASH = "693bcab18d4480a9e6a88e5ce5f0b602a5d612e305ae29af59a4d141cb29bbd610dbc25a046ec121c2fafefc6a89604b6f64ef88659d9cd42e9cc9eb950e2971"

RPROVIDES:${PN} += "libbbf-devel"

RDEPENDS:${PN} += "libbbf3"

inherit rpm
