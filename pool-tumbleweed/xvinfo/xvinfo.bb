SUMMARY = "Utility to print X-Video extension adaptor information"
DESCRIPTION = "xvinfo prints out the capabilities of any video adaptors associated \
with the display that are accessible through the X-Video extension."
LICENSE = "X11"

PV = "1.1.6"

RPM_NAME = "xvinfo-1.1.6-1.2.aarch64.rpm"
RPM_HASH = "39b09aba11dadc614da7c7df5d54e7b8476216db82cff4d3f95ce899e3edc49b68d07d25acc9a56058b62df4460d5f605939e7e354417e4e483890b4665b16b7"

RPROVIDES:${PN} += "xvinfo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXv.so.1 \
libc.so.6"

inherit rpm
