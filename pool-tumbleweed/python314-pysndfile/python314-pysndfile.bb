SUMMARY = "Cython wrapper class for reading/writing soundfiles"
DESCRIPTION = "pysndfile is a python package providing PySndfile a \
Cython wrapper class around libsndfile . PySndfile \
provides methods for reading and writing a large variety of soundfile \
formats on a variety of plattforms. PySndfile provides a rather complete \
access to the different sound file manipulation options that are \
available in libsndfile. \
 \
Due to the use of libsndfile nearly all sound file formats, (besides mp3 \
and derived formats) can be read and written with PySndfile. \
 \
The interface has been designed such that a rather large subset of the \
functionality of libsndfile can be used, notably the reading and writing \
of strings into soundfile formats that support these, and a number of \
sf\\_commands that allow to control the way libsndfile reads and writes \
the samples. One of the most important ones is the use of the clipping \
command."
LICENSE = "LGPL-3.0-only"

PV = "1.4.4"

RPM_NAME = "python314-pysndfile-1.4.4-2.8.aarch64.rpm"
RPM_HASH = "5d25c29a4b3838ef0759188ddfa831ce795ebacd45ee40179a8d31a11eed93ca02f2ada4b4e5a1e49d5f911dc44b534d51ccb11ae8aedf971813594557c2b21c"

RPROVIDES:${PN} += "python3.14dist-pysndfile \
python314-pysndfile \
python3dist-pysndfile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsndfile.so.1 \
libstdc++.so.6 \
python-abi \
python314-numpy"

inherit rpm
