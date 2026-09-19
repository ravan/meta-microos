SUMMARY = "A multithreaded FLAC to MP3/OGG/FLAC batch converter"
DESCRIPTION = "Flac2All is a multi-threaded script that will convert your collection of \
FLAC files into either Ogg Vorbis, MP3 (with the Lame encoder), or FLAC, \
complete with any tags and identical file/folder structure."
LICENSE = "GPL-3.0-only"

PV = "5.1"

RPM_NAME = "flac2all-5.1-1.20.noarch.rpm"
RPM_HASH = "484806cea20e6ce31e6783a4cddc1f7960590c711507a58dee44f031c95027d5698c652bf44640f436453d58136c9ad29491e8b58aefa32eebacd83b348ffb36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flac2all \
python3.13dist-flac2all \
python3dist-flac2all"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-curses"

inherit rpm
