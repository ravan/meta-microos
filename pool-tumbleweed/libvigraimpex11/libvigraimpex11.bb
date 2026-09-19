SUMMARY = "Computer vision Library"
DESCRIPTION = "VIGRA stands for 'Vision with Generic Algorithms'. It is a novel \
computer vision library that puts its main emphasis on customizable \
algorithms and data structures. By using template techniques similar to \
those in the C++ Standard Template Library, you can easily adapt any \
VIGRA component to the needs of your application, without giving up \
execution speed."
LICENSE = "MIT"

PV = "1.12.2"

RPM_NAME = "libvigraimpex11-1.12.2-1.14.aarch64.rpm"
RPM_HASH = "631ce2ff51ddebe5dd975dc30efbcf570af2656603ce4492133e4ebbfd9acb2ffb5dd2b8a3112dac1ab9edfbedda48ee8b11ff0067bd33bf1f215174dfbcb2ee"

RPROVIDES:${PN} += "libvigraimpex.so.11 \
libvigraimpex11 \
vigra"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libImath-3-2.so.30 \
libOpenEXR-3-4.so.33 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5-hl.so.310 \
libhdf5.so.310 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6 \
libz.so.1"

inherit rpm
