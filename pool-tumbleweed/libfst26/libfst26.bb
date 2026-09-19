SUMMARY = "Development files for OpenFST"
DESCRIPTION = "OpenFST is a library for constructing, combining, optimizing and \
searching weighted finite-state transducers (FSTs). \
 \
This package requires SSE on 32-bit x86 to function."
LICENSE = "Apache-2.0"

PV = "1.8.4"

RPM_NAME = "libfst26-1.8.4-1.7.aarch64.rpm"
RPM_HASH = "1cf4bf9d571d98af84541b58fbcdd91836189142eba6657d0396506f62c6f5b50eb8720f5007b319e6e6be960c758e6a85790754ab2537f5fb894a3422eb4ef1"

RPROVIDES:${PN} += "libfst.so.26 \
libfst26 \
libfstscript.so.26"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
