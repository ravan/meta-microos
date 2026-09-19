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

RPM_NAME = "python313-SoundCard-0.4.6-1.3.noarch.rpm"
RPM_HASH = "4329ac60991069d0b7510a1d07725230de705f51f85c1cd91cfe7a147c9597ac47ba46218d1e4ed30d62197660e6ec49ad87c866f3eff57bef641b18f345ae1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-SoundCard \
python3.13dist-soundcard \
python313-SoundCard \
python3dist-soundcard"

RDEPENDS:${PN} += "pulseaudio-daemon \
python-abi \
python313-cffi \
python313-numpy"

inherit rpm
