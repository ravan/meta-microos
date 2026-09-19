SUMMARY = "C->Haskell FFI tool that gives some cross-language type safety"
DESCRIPTION = "C->Haskell assists in the development of Haskell bindings to C libraries. \
It extracts interface information from C header files and generates Haskell \
code with foreign imports and marshaling. Unlike writing foreign imports by \
hand (or using hsc2hs), this ensures that C functions are imported with the \
correct Haskell types."
LICENSE = "GPL-2.0-or-later"

PV = "0.28.8"

RPM_NAME = "c2hs-0.28.8-5.16.aarch64.rpm"
RPM_HASH = "4aab2849fa97926488dca376eb4c21d7a9c7527fd19b6ad71acb7c7c456d55b62eb3037d43db5baac6f4daf564aaf35e36f6878518c9b61bf3fb2a246654e85e"

RPROVIDES:${PN} += "c2hs"

RDEPENDS:${PN} += "libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
