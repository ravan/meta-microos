SUMMARY = "FFMPEG wrapper for Python"
DESCRIPTION = "FFMPEG wrapper for working with video files in Python."
LICENSE = "BSD-2-Clause"

PV = "0.6.0"

RPM_NAME = "python314-imageio-ffmpeg-0.6.0-1.4.noarch.rpm"
RPM_HASH = "ce6b4e34fd9facb87fb5962e404aff871d4ddaaaaffc3a630e657d15809024cabe0409e0f0c673507d68b2e18efbf770122e95a5f949889991328b5099f24cf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-imageio-ffmpeg \
python314-imageio-ffmpeg \
python3dist-imageio-ffmpeg"

RDEPENDS:${PN} += "ffmpeg \
python-abi"

inherit rpm
