SUMMARY = "ALSA bindings for Python"
DESCRIPTION = "This package contains wrappers for accessing the ALSA API from Python. \
It is fairly complete for PCM devices and Mixer access."
LICENSE = "Python-2.0"

PV = "0.11.0"

RPM_NAME = "python313-pyalsaaudio-0.11.0-1.9.aarch64.rpm"
RPM_HASH = "7031b2b231314eaf5e6ab0ff828aec88f83c5b91798f8b449024b06e146646c64fbfc34f7dc8472c64abcc6671da37c1f35f86b61a89f31b8394ed38fc38472a"

RPROVIDES:${PN} += "python3-pyalsaaudio \
python3.13dist-pyalsaaudio \
python313-pyalsaaudio \
python3dist-pyalsaaudio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
python-abi"

inherit rpm
