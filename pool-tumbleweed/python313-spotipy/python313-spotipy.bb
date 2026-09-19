SUMMARY = "Client for the Spotify Web API"
DESCRIPTION = "Spotipy is a Python library for the Spotify Web API. \
With Spotipy, the user gets access to the music data \
provided by the Spotify platform. \
 \
Documentation is available at \
https://spotipy.readthedocs.io/"
LICENSE = "MIT"

PV = "2.26.0"

RPM_NAME = "python313-spotipy-2.26.0-1.3.noarch.rpm"
RPM_HASH = "aa6bc89834d58838576579580865120250ddebec7237c4103b5ff3e8caf9a06212d20ad21c609a32dd3c56342caf1052e8dbf94df760201b6b39f82f11feb5c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-spotipy \
python3.13dist-spotipy \
python313-spotipy \
python3dist-spotipy"

RDEPENDS:${PN} += "python-abi \
python313-redis \
python313-requests \
python313-urllib3"

inherit rpm
