SUMMARY = "Imlib 2 - demo programs"
DESCRIPTION = "This package contains the imlib2 demo programs."
LICENSE = "BSD-3-Clause"

PV = "1.12.7"

RPM_NAME = "imlib2-demo-1.12.7-1.1.aarch64.rpm"
RPM_HASH = "ba81e3e52a4bc301e25696fa86444fd3307d7cda7e430d1545e52d809004b50f865e617426a289276eca34e44caf211252167480b00f7980952d077dec085ec2"

RPROVIDES:${PN} += "imlib2-demo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libImlib2-1 \
libImlib2.so.1 \
libX11.so.6 \
libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
