SUMMARY = "The GNU Compiler Thread Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=thread option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.5.0+git10516"

RPM_NAME = "libtsan2-gcc13-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "fb564fe6e160d47d09c150dc4063f9f9b58986176c2909da1c0969d45a0c2acf92ed0d12e2744ed0dae6015604457f45e328a430964c485073f995b513c40514"

RPROVIDES:${PN} += "libtsan.so.2 \
libtsan2 \
libtsan2-gcc13"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
