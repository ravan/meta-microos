SUMMARY = "MPEG-2 Video Stream Decoder"
DESCRIPTION = "libmpeg2 is a library for decoding MPEG-1 and MPEG-2 video streams."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.1"

RPM_NAME = "libmpeg2convert0-0.5.1-3.23.aarch64.rpm"
RPM_HASH = "a924b5c7c7a85489a717736ef9c7bac8361636907c359de7dca13904e00d731dfecaf7c26bf62b10f08cb0870db9b42da1d41a99f82d31f16b5ca0c54e8e9147"

RPROVIDES:${PN} += "libmpeg2convert.so.0 \
libmpeg2convert0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
