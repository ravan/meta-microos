SUMMARY = "Python bindings for Xiphorg's Ogg Vorbis, Opus and FLAC"
DESCRIPTION = "PyOgg provides bindings for Xiph.org's OGG Vorbis, OGG Opus and FLAC \
audio file formats."
LICENSE = "BSD-3-Clause"

PV = "0.6.14a1"

RPM_NAME = "python313-PyOgg-0.6.14a1-3.5.noarch.rpm"
RPM_HASH = "a373e0c28107344b6a1214f2c9773b5c34320f9d667c48a0cdf47f82d092e43ce03930cb13997bd73af1e6374f3f903c0febb7dc93103e647156de7bbf462452"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyOgg \
python3.13dist-pyogg \
python313-PyOgg \
python3dist-pyogg"

RDEPENDS:${PN} += "python-abi"

inherit rpm
