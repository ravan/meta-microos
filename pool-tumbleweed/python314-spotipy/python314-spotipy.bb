SUMMARY = "Client for the Spotify Web API"
DESCRIPTION = "Spotipy is a Python library for the Spotify Web API. \
With Spotipy, the user gets access to the music data \
provided by the Spotify platform. \
 \
Documentation is available at \
https://spotipy.readthedocs.io/"
LICENSE = "MIT"

PV = "2.26.0"

RPM_NAME = "python314-spotipy-2.26.0-1.3.noarch.rpm"
RPM_HASH = "71456f938001d30cede610afe679693247a40f9fd8cb492b5ca1144417e44ac5b03a72911d29c3d27e98ed49126c76a19fa3ecf08866cfce571e04b3fb4b07c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-spotipy \
python314-spotipy \
python3dist-spotipy"

RDEPENDS:${PN} += "python-abi \
python314-redis \
python314-requests \
python314-urllib3"

inherit rpm
