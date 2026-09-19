SUMMARY = "Header files and libraries for Enca development"
DESCRIPTION = "The enca-devel package contains the static libraries and header files \
for writing programs using the Extremely Naive Charset Analyser library, \
and its API documentation. \
 \
Install enca-devel if you are going to create applications using the Enca \
library."
LICENSE = "GPL-2.0-only"

PV = "1.19"

RPM_NAME = "libenca0-1.19-2.14.aarch64.rpm"
RPM_HASH = "e094fd832301b2113b20982653b9a83d99d272c8c5ce6c44b2002c7ef916a57f70287a552f928ab35c200d21382663d4db60fd5504ab00b4fd86cdfa9e87593c"

RPROVIDES:${PN} += "libenca.so.0 \
libenca0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
