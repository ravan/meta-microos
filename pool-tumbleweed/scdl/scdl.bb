SUMMARY = "Souncloud Music Downloader"
DESCRIPTION = "The program can download music from SoundCloud and set id3tag to the downloaded music."
LICENSE = "GPL-2.0-only"

PV = "2.12.1"

RPM_NAME = "scdl-2.12.1-2.10.noarch.rpm"
RPM_HASH = "1dedcfe60da2febd65a9c9af02fc6489a893d8a91aa2715c4a7c2908fa2a53bf105845e12b93f45dc6227af18ec7ae50aa0fd2b49447849f3fa9fae3bf8517fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-scdl \
python3dist-scdl \
scdl"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
ffmpeg \
python-abi \
python3-docopt-ng \
python3-filelock \
python3-mutagen \
python3-pathvalidate \
python3-requests \
python3-soundcloud-v2 \
python3-termcolor \
python3-tqdm"

inherit rpm
