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

RPM_NAME = "python313-SoundFile-0.14.0-1.1.noarch.rpm"
RPM_HASH = "633e4d37906a3883900e7c61208064cfec446fda02a9993d905e293d8a72db2400b89cf971a7dab6f77742376396c0f354590e3628de230fa0ef54cfcc817afe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PySoundFile \
python3-SoundFile \
python3-soundfile \
python3.13dist-soundfile \
python313-PySoundFile \
python313-SoundFile \
python313-soundfile \
python3dist-soundfile"

RDEPENDS:${PN} += "libsndfile1 \
python-abi \
python313-cffi \
python313-numpy \
python313-typing-extensions"

inherit rpm
