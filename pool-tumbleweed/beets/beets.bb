SUMMARY = "Music tagger and library organizer"
DESCRIPTION = "Beets is a media library management system for obsessive-compulsive music \
geeks. \
 \
The purpose of beets is to get a music collection right once and for all. \
It catalogs the collection, automatically improving its metadata as it goes. \
It then provides a bouquet of tools for manipulating and accessing the music. \
 \
beets is designed as a library, has a number of plugins which \
support these actions: \
 \
- Fetch or calculate all the metadata that could possibly be needed: \
  album art, lyrics, genres, tempos, ReplayGain levels, or acoustic \
  fingerprints. \
- Get metadata from MusicBrainz, Discogs, and Beatport, or guess \
  metadata using songs' filenames or their acoustic fingerprints. \
- Transcode audio to any format. \
- Check your library for duplicate tracks and albums or for albums that \
  are missing tracks. \
- Clean up crufty tags left behind by other tools. \
- Embed and extract album art from files' metadata. \
- Browse the music library graphically through a Web browser and play it in any \
  browser that supports HTML5 Audio. \
- Analyze music files' metadata from the command line. \
- Listen to your library with a music player that speaks the MPD protocol \
  and works with a variety of interfaces. \
 \
Writing additional plugins for beets is possible using Python."
LICENSE = "MIT"

PV = "2.13.1"

RPM_NAME = "beets-2.13.1-1.1.noarch.rpm"
RPM_HASH = "831f54d897024dfbcb9f2b71637823f4ec3192b585c7b88724537fa5c07f7ea8f6e04ba14c8b70e245b97820dd5f466e4e29720648974e8f8e8cfa8f98df5ab9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "beets \
python3.13dist-beets \
python3dist-beets"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-PyYAML \
python3-Unidecode \
python3-confuse \
python3-jellyfish \
python3-lap \
python3-mediafile \
python3-numpy \
python3-packaging \
python3-platformdirs \
python3-requests \
python3-requests-ratelimiter \
python3-sqlite3"

inherit rpm
