SUMMARY = "KtoBLZCheck development files"
DESCRIPTION = "Libraries, includes etc to develop with ktoblzcheck library."
LICENSE = "LGPL-2.1-only"

PV = "1.59"

RPM_NAME = "ktoblzcheck-devel-1.59-1.5.aarch64.rpm"
RPM_HASH = "de317fd13fe333264077714f744a93a0743c559efd4bf7e28573205e4c472a857c9925b5b50d5c0d7f7e44aeac4b979d99964ff35ed71ff9776a1b0adc69750f"

RPROVIDES:${PN} += "cmake-KtoBlzCheck \
ktoblzcheck-devel \
libktoblzcheck1-devel \
pkgconfig-ktoblzcheck"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libktoblzcheck1"

inherit rpm
