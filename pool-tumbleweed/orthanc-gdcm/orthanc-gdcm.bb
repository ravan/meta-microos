SUMMARY = "GDCM plugin for Orthanc"
DESCRIPTION = "GDCM for Orthanc"
LICENSE = "GPL-3.0-or-later"

PV = "1.8"

RPM_NAME = "orthanc-gdcm-1.8-1.9.aarch64.rpm"
RPM_HASH = "6cbea5ef69958c661d2ac5330644ca13b7e6a134d6062d7c71b46d23076e3b0ceb15eccc3816da8c6c18f5e628dc324b2559d35d99317dba7563cf9f00dc37ca"

RPROVIDES:${PN} += "libOrthancGdcm.so.1.8 \
orthanc-gdcm"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.91.0 \
libboost-iostreams.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libgdcmCommon.so.3.2 \
libgdcmDSED.so.3.2 \
libgdcmMSFF.so.3.2 \
libjsoncpp.so.27 \
libstdc++.so.6 \
orthanc"

inherit rpm
