SUMMARY = "The GNU Compiler Hardware-assisted Address Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=hwaddress option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "16.2.0+git9497"

RPM_NAME = "libhwasan0-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "e3401afa37e77c661944e90269a04d2e95ffbde96d27769338353d2fb783eb6d3ac0c9965a21861c14ea8645eec24c41437734ea368ead99166496c992e1149d"

RPROVIDES:${PN} += "libhwasan.so.0 \
libhwasan0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
