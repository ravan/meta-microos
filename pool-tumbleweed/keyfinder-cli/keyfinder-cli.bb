SUMMARY = "Utility to estimate the musical key of many different audio file formats"
DESCRIPTION = "keyfinder-cli is a utility to estimate the musical key of many different audio file formats."
LICENSE = "GPL-3.0-only"

PV = "1.1.4"

RPM_NAME = "keyfinder-cli-1.1.4-1.5.aarch64.rpm"
RPM_HASH = "b7ef65f7fe3ac93827f043471d98bd3394f59eaa6889082e563717e59718b68a1949a010c64ee4a6def449b27df4853daca3031eb5a45e8c48906a9f1f52d176"

RPROVIDES:${PN} += "keyfinder-cli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libgcc-s.so.1 \
libkeyfinder.so.2 \
libstdc++.so.6 \
libswresample.so.6"

inherit rpm
