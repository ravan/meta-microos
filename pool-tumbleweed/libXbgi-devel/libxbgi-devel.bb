SUMMARY = "Development files for the XBGI library"
DESCRIPTION = "libXbgi is a Borland Graphics Interface (BGI) emulation library for \
X11. This library strictly emulates most BGI functions, making it \
possible to compile X11 versions of programs written for \
Turbo/Borland C. RGB extensions and basic mouse support are also \
implemented. \
 \
This package contains the development headers for the library found \
in libXbgi1."
LICENSE = "MIT"

PV = "365"

RPM_NAME = "libXbgi-devel-365-4.5.aarch64.rpm"
RPM_HASH = "cf3ca3f9037a531d833c3ad7a39487030bab8998a828bb71e45b017c4c0b4d2bdd5916301115b4cc66eba25a0dbc0069071d6f20dbf96a8c20b4f6ee8c35a464"

RPROVIDES:${PN} += "libXbgi-devel"

RDEPENDS:${PN} += "libX11-devel \
libXbgi1"

inherit rpm
