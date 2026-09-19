SUMMARY = "The GNU Compiler Undefined Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=undefined option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "14.4.0+git12698"

RPM_NAME = "libubsan1-gcc14-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "c4fa4ee9175e44345cc6f44403db97a92843793637e0ef0f63d659c127968760f9ac297624e34d03837279bed3893db66c1c4a8c9235c12baee620bad2fe165e"

RPROVIDES:${PN} += "libubsan.so.1 \
libubsan1 \
libubsan1-gcc14"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
