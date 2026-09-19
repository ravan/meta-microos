SUMMARY = "A DAB receiver with a technical focus"
DESCRIPTION = "A DAB receiver with a technical focus."
LICENSE = "GPL-2.0-only"

PV = "5.7.0"

RPM_NAME = "dabstar-5.7.0-1.1.aarch64.rpm"
RPM_HASH = "0d85e65f220d90ba59e721d930d1aac99ac1a57c9a82b101ae3b3b3d55f2a97ce05d5fb1f6e33fcfbed8ac08d6e81b1ac76da35ad2145bb5ac97e78805380b86"

RPROVIDES:${PN} += "dabstar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Charts.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Network.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libSoapySDR.so.0.8-3 \
libc.so.6 \
libfdk-aac.so.2 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libmvec.so.1 \
libsndfile.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
