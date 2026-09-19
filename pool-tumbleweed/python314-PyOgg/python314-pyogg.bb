SUMMARY = "Python bindings for Xiphorg's Ogg Vorbis, Opus and FLAC"
DESCRIPTION = "PyOgg provides bindings for Xiph.org's OGG Vorbis, OGG Opus and FLAC \
audio file formats."
LICENSE = "BSD-3-Clause"

PV = "0.6.14a1"

RPM_NAME = "python314-PyOgg-0.6.14a1-3.5.noarch.rpm"
RPM_HASH = "e79956697643cd110a9779249843efe453cfeb1b480bd34d8b2ce91fcd710447334416708360567207bc79112341676bc9c6a9c0140aed808271bc85d62966bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyogg \
python314-PyOgg \
python3dist-pyogg"

RDEPENDS:${PN} += "python-abi"

inherit rpm
