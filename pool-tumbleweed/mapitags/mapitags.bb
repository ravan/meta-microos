SUMMARY = "MAPI tag name database"
DESCRIPTION = "A list of mnemonics for MAPI property tags. MAPI programs (e.g. \
gromox-eml2mt) can use these to translate between 32-bit property \
numbers and a human-readable mnemonic name."
LICENSE = "MIT"

PV = "20240617"

RPM_NAME = "mapitags-20240617-1.8.aarch64.rpm"
RPM_HASH = "ac5c706507ba8df5330d48147b310a131eb6a04f014bf80218df602754c3d179e1dc089d5506e755279fdf08721c4814914a0e20c9c873a5cb22f6644e7b9770"

RPROVIDES:${PN} += "mapitags"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
