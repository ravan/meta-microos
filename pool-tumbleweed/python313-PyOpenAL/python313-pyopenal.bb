SUMMARY = "Python bindings for OpenAL"
DESCRIPTION = "PyOpenAL provides OpenAL bindings for Python as well as an interface \
to them. \
 \
It also provides a way to play WAVE and, if PyOgg is \
installed, OGG Vorbis, OGG Opus and FLAC files."
LICENSE = "SUSE-Public-Domain"

PV = "0.7.11a1"

RPM_NAME = "python313-PyOpenAL-0.7.11a1-2.5.noarch.rpm"
RPM_HASH = "9b8dec62dc0e88ec5bceb75452d32737dd14aa47702e77c96b4df963f01d20f468e2bd57d8e27b5160e93344c47b8f44dd0d2fba31dec7f61222ea65fe2b757b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyOpenAL \
python3.13dist-pyopenal \
python313-PyOpenAL \
python3dist-pyopenal"

RDEPENDS:${PN} += "libopenal1 \
python-abi"

inherit rpm
