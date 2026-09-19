SUMMARY = "SUSE Linux background"
DESCRIPTION = "The SUSE Linux background for your XDM workstation."
LICENSE = "GPL-2.0-or-later"

PV = "0.8"

RPM_NAME = "xdmbgrd-0.8-2.11.aarch64.rpm"
RPM_HASH = "0b827fb36ffb75266e279cda6e590bd29f4fee3930bba3ceb03a5308fccfff45bdfb4b45690bec6fba1d872d08af84dc885cb730263b34b700d5843378302ccd"

RPROVIDES:${PN} += "xdmbgrd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXpm.so.4 \
libc.so.6 \
libz.so.1"

inherit rpm
