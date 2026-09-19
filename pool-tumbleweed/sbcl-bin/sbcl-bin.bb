SUMMARY = "The Steel Bank Common Lisp loader program"
DESCRIPTION = "This package contains just the SBCL loader stub."
LICENSE = "BSD-3-Clause & LicenseRef-SUSE-Public-Domain"

PV = "2.6.8"

RPM_NAME = "sbcl-bin-2.6.8-1.1.aarch64.rpm"
RPM_HASH = "90b812fb9ad7f8a95cb2ec5f70a9131d37ae6401491813fab718f41846a606d3af68adde4df8b8308bab50bad1ca44dabe7d736229e98d6189bc06731dc6236a"

RPROVIDES:${PN} += "sbcl-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libzstd.so.1"

inherit rpm
