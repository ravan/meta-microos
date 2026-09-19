SUMMARY = "Test program for the XFree86-DGA extension"
DESCRIPTION = "dga is a simple test client for the XFree86-DGA extension."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "xf86dga-1.0.3-9.37.aarch64.rpm"
RPM_HASH = "ecb0b8f2596ef56a80614ab25a1c09e92d40dd944e641a2347f6850655c92df763b0a82a43edf2e540570faee442fce33a66c5f44848217bc45ce29b526c5e98"

RPROVIDES:${PN} += "xf86dga"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXxf86dga.so.1 \
libc.so.6"

inherit rpm
