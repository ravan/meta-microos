SUMMARY = "Android platform tools"
DESCRIPTION = "Android SDK Platform-Tools is a component for the Android SDK. \
It includes tools that interface with the Android platform."
LICENSE = "Apache-2.0 & MIT"

PV = "37.0.0"

RPM_NAME = "android-tools-37.0.0-1.2.aarch64.rpm"
RPM_HASH = "c75dbd85f3479d61d48448f2726331a2bea8952759166f0fe65772dc28e8cd08d6fefd7b23381b7f368189bfad3a310f6e49f1d5958d06c8b86839e18927010a"

RPROVIDES:${PN} += "adb \
android-tools \
android-tools-bash-completion \
android-tools-python3 \
avbtool \
bundled-boringssl \
sload-f2fs"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libbrotlienc.so.1 \
libc.so.6 \
libfmt.so.12 \
libgcc-s.so.1 \
liblz4.so.1 \
libpcre2-8.so.0 \
libprotobuf.so.34.2.0 \
libstdc++.so.6 \
libusb-1.0.so.0 \
libz.so.1 \
libzstd.so.1 \
python3-base"

inherit rpm
