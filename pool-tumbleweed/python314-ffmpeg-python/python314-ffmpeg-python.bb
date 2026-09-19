SUMMARY = "Python bindings for FFmpeg"
DESCRIPTION = "Python bindings for FFmpeg - with complex filtering support"
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "python314-ffmpeg-python-0.2.0-7.13.noarch.rpm"
RPM_HASH = "188825caf93d7921d1a1a66b200a06d85196d2650d220e0fda3a913ee41b69fa8fff8d3a172bb2a05cd60aaf70c21c8bcf503f90cbfb9ebdf2e9ca357e85b6d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ffmpeg-python \
python314-ffmpeg-python \
python3dist-ffmpeg-python"

RDEPENDS:${PN} += "python-abi"

inherit rpm
