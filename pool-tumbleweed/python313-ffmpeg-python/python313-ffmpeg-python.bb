SUMMARY = "Python bindings for FFmpeg"
DESCRIPTION = "Python bindings for FFmpeg - with complex filtering support"
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "python313-ffmpeg-python-0.2.0-7.13.noarch.rpm"
RPM_HASH = "a514341e60af24df0910f72dd99c35fe626a84ba56c81266430993f09ce3817f82622b64773d970508a134c0928599a761d796b2f76d4d53b6ea756cd5f29411"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ffmpeg-python \
python3.13dist-ffmpeg-python \
python313-ffmpeg-python \
python3dist-ffmpeg-python"

RDEPENDS:${PN} += "python-abi"

inherit rpm
