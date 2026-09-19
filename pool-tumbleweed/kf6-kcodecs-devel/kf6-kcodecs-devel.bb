SUMMARY = "Header files for kcodecs, a method collection for string manipulation"
DESCRIPTION = "Development files for KCodecs, a method collection to manipulate \
strings using various encodings."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kcodecs-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "c2df8b7f4ec50cb3bdaa0c687eece5515a5158c759214d7cf379745700dbabf42b32616e655334fce436b5f334ea9cfabc6ef5ddab15379e2cdf9b1078932d4c"

RPROVIDES:${PN} += "cmake-KF6Codecs \
kf6-kcodecs-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
libKF6Codecs6"

inherit rpm
