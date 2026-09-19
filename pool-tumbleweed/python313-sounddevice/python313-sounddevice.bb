SUMMARY = "Module to play and record sound with Python"
DESCRIPTION = "This Python module provides bindings for the PortAudio library and a few \
convenience functions to play and record NumPy arrays containing audio signals."
LICENSE = "MIT"

PV = "0.5.5"

RPM_NAME = "python313-sounddevice-0.5.5-1.4.noarch.rpm"
RPM_HASH = "0af3110620dcac7605429c58bb0ff4899fd0b1cfd410065a7f84fd3a6e1c924a40f9c6e136cf6bc9c384f4ea8e67cdec093f886be5ad7cfd860486e48ea35783"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sounddevice \
python3.13dist-sounddevice \
python313-sounddevice \
python3dist-sounddevice"

RDEPENDS:${PN} += "portaudio \
python-abi \
python313-cffi"

inherit rpm
