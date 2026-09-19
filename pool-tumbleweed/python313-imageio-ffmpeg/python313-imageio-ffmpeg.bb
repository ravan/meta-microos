SUMMARY = "FFMPEG wrapper for Python"
DESCRIPTION = "FFMPEG wrapper for working with video files in Python."
LICENSE = "BSD-2-Clause"

PV = "0.6.0"

RPM_NAME = "python313-imageio-ffmpeg-0.6.0-1.4.noarch.rpm"
RPM_HASH = "cf48eefde51e1fc5712d7649f6a5d0ccedee318ab9a3df6f9d7dd2de70b4993b72e8194a13e4989d688ae1aa1d50ed79a08b91462bff9649a429694c4c4e2411"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-imageio-ffmpeg \
python3.13dist-imageio-ffmpeg \
python313-imageio-ffmpeg \
python3dist-imageio-ffmpeg"

RDEPENDS:${PN} += "ffmpeg \
python-abi"

inherit rpm
