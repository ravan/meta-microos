SUMMARY = "CFD General Notation System library"
DESCRIPTION = "Files required to develop applications using CGNS (CFD General notation system)."
LICENSE = "Zlib"

PV = "4.4.0"

RPM_NAME = "cgns-devel-4.4.0-2.13.aarch64.rpm"
RPM_HASH = "266d9cb7a3552e610f7ddcffeb439361e8c2e0aa9a0e76cd821e02fb70f726424c9e4b0a6c2715b66bc948b18f574f78e1119b144484529ff928398f680a5c72"

RPROVIDES:${PN} += "cgns-devel \
libcgns-devel"

RDEPENDS:${PN} += "libcgns4-4"

inherit rpm
