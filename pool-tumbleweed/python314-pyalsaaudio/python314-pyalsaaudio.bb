SUMMARY = "ALSA bindings for Python"
DESCRIPTION = "This package contains wrappers for accessing the ALSA API from Python. \
It is fairly complete for PCM devices and Mixer access."
LICENSE = "Python-2.0"

PV = "0.11.0"

RPM_NAME = "python314-pyalsaaudio-0.11.0-1.9.aarch64.rpm"
RPM_HASH = "c4ebcaf7660a81a1a52ac4c42991d4efef5f67bc5a23d1957b6755fc6a06cde9b527d2c9317ab14ebeaa5b8898f4edb2b9122f3cea08bc19da260eef612d02b4"

RPROVIDES:${PN} += "python3.14dist-pyalsaaudio \
python314-pyalsaaudio \
python3dist-pyalsaaudio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
python-abi"

inherit rpm
