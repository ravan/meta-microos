SUMMARY = "Text editor based on Scintilla and Turbo Vision"
DESCRIPTION = "Turbo is an experimental text editor for the terminal, \
based on the Scintilla code editing component by Neil \
Hodgson and the Turbo Vision application framework."
LICENSE = "MIT"

PV = "1715766145.697580e"

RPM_NAME = "turbo-1715766145.697580e-1.9.aarch64.rpm"
RPM_HASH = "f560045ac6d301a707c2d84bd09cd3f2853c869ecfd754a166e66492b0cacab2a1a88de0a494fd52bc2292865f8de4f725fa924cef8e8112425c40b507189e34"

RPROVIDES:${PN} += "libturbo-core.so \
turbo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libncursesw.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
