SUMMARY = "Python bindings for OpenAL"
DESCRIPTION = "PyOpenAL provides OpenAL bindings for Python as well as an interface \
to them. \
 \
It also provides a way to play WAVE and, if PyOgg is \
installed, OGG Vorbis, OGG Opus and FLAC files."
LICENSE = "SUSE-Public-Domain"

PV = "0.7.11a1"

RPM_NAME = "python314-PyOpenAL-0.7.11a1-2.5.noarch.rpm"
RPM_HASH = "5eed7264ce819d59e015770d8735e8fae216a511fc3fb3514508c090f969b5ce9552f9b686a1b4883ceb92ac4c02f854be805ebb73ebbffe453bb8d05e681cf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyopenal \
python314-PyOpenAL \
python3dist-pyopenal"

RDEPENDS:${PN} += "libopenal1 \
python-abi"

inherit rpm
