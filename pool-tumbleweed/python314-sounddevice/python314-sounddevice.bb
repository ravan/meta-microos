SUMMARY = "Module to play and record sound with Python"
DESCRIPTION = "This Python module provides bindings for the PortAudio library and a few \
convenience functions to play and record NumPy arrays containing audio signals."
LICENSE = "MIT"

PV = "0.5.5"

RPM_NAME = "python314-sounddevice-0.5.5-1.4.noarch.rpm"
RPM_HASH = "d04e5fd1455f3d25ef92cd658e16c463e35c3c54f2c9bd33c52707613eeef44cedfc1447c331e20d9d70d53a6d3fb121d58f2cff66901d000ca8758550a708c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sounddevice \
python314-sounddevice \
python3dist-sounddevice"

RDEPENDS:${PN} += "portaudio \
python-abi \
python314-cffi"

inherit rpm
