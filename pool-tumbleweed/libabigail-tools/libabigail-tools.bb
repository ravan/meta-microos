SUMMARY = "Utilities to inspect ABI-relevant artifacts"
DESCRIPTION = "ABIGAIL constructs, manipulates, (de-)serializes ABI-relevant \
artifacts, such as types, variable, fonctions and declarations \
(collectively, the ABI corpus) of a given library or program. \
 \
This subpackage contains the ABIGAIL utilities allowing to infer \
interesting conclusions about these differences."
LICENSE = "Apache-2.0-with-LLVM-exception"

PV = "2.10"

RPM_NAME = "libabigail-tools-2.10-1.3.aarch64.rpm"
RPM_HASH = "a8a6a291d2909c4a173fff173149daed64fab2244111d46673db495ab09241a749e0575848fd2e34c16c8dc51ff4bafbda220e0198fb7547f6a5e6a07566f4c3"

RPROVIDES:${PN} += "libabigail-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libabigail.so.9 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
