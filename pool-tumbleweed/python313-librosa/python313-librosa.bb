SUMMARY = "Python module for audio and music processing"
DESCRIPTION = "LibROSA is a python package for music and audio analysis. It provides \
the building blocks necessary to create music information retrieval \
systems."
LICENSE = "CC-BY-3.0 & ISC"

PV = "0.11.0"

RPM_NAME = "python313-librosa-0.11.0-1.4.noarch.rpm"
RPM_HASH = "d3584d83b305c2f7986b44c54e4d0f86c3a7e9467409743b406ee3be94b16a334890e4a2085a96d0e7901dfc5e29fe45e1db698898af12bbf1b1da3dad01d510"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-librosa \
python3.13dist-librosa \
python313-librosa \
python3dist-librosa"

RDEPENDS:${PN} += "python-abi \
python313-SoundFile \
python313-audioread \
python313-decorator \
python313-joblib \
python313-lazy-loader \
python313-msgpack \
python313-numba \
python313-numpy \
python313-pooch \
python313-scikit-learn \
python313-scipy \
python313-soxr \
python313-typing-extensions"

inherit rpm
