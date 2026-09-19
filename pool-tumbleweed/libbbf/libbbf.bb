SUMMARY = "Bound Book Format container for comics and manga"
DESCRIPTION = "Bound Book Format (.bbf) is a high-performance binary container designed \
specifically for digital comic books and manga. Unlike CBR/CBZ, BBF is built \
for DirectSotrage/mmap, easy integrity checks, and mixed-codec \
containerization."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "libbbf-3.0.1-1.3.aarch64.rpm"
RPM_HASH = "3b882ed6027d5652fe012c952c25d946b9c57ad4a2873351e15982178459b9f8b6040ea47683f7daa3dc45fd59018fb5eca56133cacde6bae4341c284dac7169"

RPROVIDES:${PN} += "libbbf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblibbbf.so.3"

inherit rpm
