SUMMARY = "Header files for wordcut, a Thai word segmentation utility"
DESCRIPTION = "This package contains files necessary to build against libwordcut."
LICENSE = "BSD-3-Clause"

PV = "0.5.1b2"

RPM_NAME = "wordcut-devel-0.5.1b2-207.9.aarch64.rpm"
RPM_HASH = "6601e4ed7e536402b8f170ab7062cf33d119c71062ee4c2647679061520d456c6d9d82a126429cb141210d9270544981bada8561370069b58a7ad619b3a8d643"

RPROVIDES:${PN} += "pkgconfig-wordcut \
wordcut-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libwordcut0"

inherit rpm
