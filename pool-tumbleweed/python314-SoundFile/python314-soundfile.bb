SUMMARY = "An audio library based on libsndfile, CFFI and NumPy"
DESCRIPTION = "PySoundFile is an audio library based on libsndfile, CFFI and NumPy. \
Full documentation is available on https://python-soundfile.readthedocs.io/. \
 \
PySoundFile can read and write sound files. File reading/writing is \
supported through libsndfile, which itself is accessed through CFFI, \
a foreign function interface for Python calling C code. PySoundFile \
represents audio data as NumPy arrays."
LICENSE = "BSD-3-Clause"

PV = "0.14.0"

RPM_NAME = "python314-SoundFile-0.14.0-1.1.noarch.rpm"
RPM_HASH = "a0e16d41c8d61b63b2d6cc48cb5e73e90958c9bba61d509e918145e95bcaf15d13002d635fa8bad50875f13c2467fde731a4cc17e392e9a96103c25269c86c4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-soundfile \
python314-PySoundFile \
python314-SoundFile \
python314-soundfile \
python3dist-soundfile"

RDEPENDS:${PN} += "libsndfile1 \
python-abi \
python314-cffi \
python314-numpy \
python314-typing-extensions"

inherit rpm
