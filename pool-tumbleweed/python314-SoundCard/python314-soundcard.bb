SUMMARY = "Python package to play and record audio"
DESCRIPTION = "SoundCard is a library for playing and recording audio without \
resorting to a CPython extension. Instead, it is implemented using \
CFFI and the native audio libraries of Linux, Windows and macOS. \
 \
SoundCard is cross-platform, and supports Linux/pulseaudio, \
Mac/coreaudio, and Windows/WASAPI. While the interface is identical \
across platforms, naming schemes and block sizes can vary between \
devices and platforms."
LICENSE = "BSD-3-Clause"

PV = "0.4.6"

RPM_NAME = "python314-SoundCard-0.4.6-1.3.noarch.rpm"
RPM_HASH = "23c71259cbfc4c82a2b83915874921457cdae11a98aa1fc269f0a64718d720f7ca29efcbb1c1e9515bd0124be8d79eb666127e0a2af91ddde3105494e5722c37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-soundcard \
python314-SoundCard \
python3dist-soundcard"

RDEPENDS:${PN} += "pulseaudio-daemon \
python-abi \
python314-cffi \
python314-numpy"

inherit rpm
