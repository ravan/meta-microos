SUMMARY = "Portable Real-Time Audio Library"
DESCRIPTION = "PortAudio is a portable audio I/O library designed for cross-platform \
support of audio. It uses a callback mechanism to request audio \
processing. Audio can be generated in various formats, including 32 bit \
floating point, and will be converted to the native format internally."
LICENSE = "MIT"

PV = "190700_20210406"

RPM_NAME = "libportaudiocpp0-190700_20210406-1.19.aarch64.rpm"
RPM_HASH = "b5723c4b858822e1952abad8b943e44d56fa011450fd137bd55413cdee16b36ccabded6358d643e6103895022b1f09cef5f007015993758acb1ad45c59c11963"

RPROVIDES:${PN} += "libportaudiocpp.so.0 \
libportaudiocpp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libportaudio.so.2 \
libstdc++.so.6"

inherit rpm
