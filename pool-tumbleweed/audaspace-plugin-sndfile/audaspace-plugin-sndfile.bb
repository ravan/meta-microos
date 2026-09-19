SUMMARY = "Sndfile plugin for audaspace"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library. \
This package contains the Sndfile plugin"
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "audaspace-plugin-sndfile-1.10.0-1.1.aarch64.rpm"
RPM_HASH = "01d8f329664f5cbc3268c61b4cd8841c1fb8ef711bbfc3bfe4deb815da5efcb8307d3db29e05fa66ec226dce1613d58581eb0dc8871a139d36fc28c0903d92a1"

RPROVIDES:${PN} += "audaspace-fileplugin \
audaspace-plugin-sndfile \
libaudlibsndfile.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaudaspace.so.1.10 \
libc.so.6 \
libgcc-s.so.1 \
libsndfile.so.1 \
libstdc++.so.6"

inherit rpm
