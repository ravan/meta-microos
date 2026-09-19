SUMMARY = "Python module for audio and music processing"
DESCRIPTION = "LibROSA is a python package for music and audio analysis. It provides \
the building blocks necessary to create music information retrieval \
systems."
LICENSE = "CC-BY-3.0 & ISC"

PV = "0.11.0"

RPM_NAME = "python314-librosa-0.11.0-1.4.noarch.rpm"
RPM_HASH = "24cc611ce45da1c0b39a9c9aff0342afe6dc2cb67c1324035ce48729019af55add7b4347b8ca9d0a2003ed4c958377c669a5e676aed7b91fbf2dbe59c01933e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-librosa \
python314-librosa \
python3dist-librosa"

RDEPENDS:${PN} += "python-abi \
python314-SoundFile \
python314-audioread \
python314-decorator \
python314-joblib \
python314-lazy-loader \
python314-msgpack \
python314-numba \
python314-numpy \
python314-pooch \
python314-scikit-learn \
python314-scipy \
python314-soxr \
python314-typing-extensions"

inherit rpm
