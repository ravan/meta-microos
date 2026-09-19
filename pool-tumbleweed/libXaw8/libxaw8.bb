SUMMARY = "The X Athena Widget Set"
DESCRIPTION = "The X Window System Athena widget set implements simple user \
interfaces based upon the X Toolkit Intrinsics (Xt) library."
LICENSE = "MIT"

PV = "1.0.16"

RPM_NAME = "libXaw8-1.0.16-1.9.aarch64.rpm"
RPM_HASH = "1c199551b9a68e1ca6b053ab3719b999a2261f2fbcc3b1aaea1512b200c162469133a9ae1870861ed3a12c874e8ccb0b53342fadcc7e607bbb5d46cca0444397"

RPROVIDES:${PN} += "libXaw.so.8 \
libXaw8 \
libXaw8.so.8"

RDEPENDS:${PN} += "/sbin/ldconfig \
libXaw7"

inherit rpm
