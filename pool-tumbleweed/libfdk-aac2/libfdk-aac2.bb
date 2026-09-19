SUMMARY = "Modified Version of the FDK AAC Codec Library for Android"
DESCRIPTION = "The Third-Party Modified Version of the Fraunhofer FDK AAC Codec Library \
for Android is software that implements part of the MPEG Advanced Audio Coding \
('AAC') encoding and decoding scheme for digital audio."
LICENSE = "FDK-AAC"

PV = "2.0.3"

RPM_NAME = "libfdk-aac2-2.0.3-1.2.aarch64.rpm"
RPM_HASH = "6c3de68c5aad9f159ddd9395918f02fa68ad57135b4e603fc47f1004ab0d11e5e0c96ca952d7df8d4ebc460e3ca03b386d7326347cbea011e01d5cce6ffb2c7e"

RPROVIDES:${PN} += "libfdk-aac.so.2 \
libfdk-aac2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
