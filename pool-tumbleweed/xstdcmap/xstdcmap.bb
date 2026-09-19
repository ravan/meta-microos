SUMMARY = "Utility to define standard colormap properties"
DESCRIPTION = "The xstdcmap utility can be used to selectively define standard colormap \
properties. It is intended to be run from a user's X startup script to \
create standard colormap definitions in order to facilitate sharing of \
scarce colormap resources among clients using PseudoColor visuals."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "xstdcmap-1.0.6-1.2.aarch64.rpm"
RPM_HASH = "ca830c36ab6904ec0486b4b968eed6ac06e16b457c6b163f31b5a08b81db0fe136c7f83401bbfc62ba047cb23175fe8e104b84369e32712aa4b0582a7b861dac"

RPROVIDES:${PN} += "xstdcmap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXmu.so.6 \
libc.so.6"

inherit rpm
