SUMMARY = "Script to download subtitles for media files"
DESCRIPTION = "A script that allows to download subtitles for TV-Series, Anime and Movies from \
subscene and other sites."
LICENSE = "GPL-3.0-only"

PV = "1.0.4"

RPM_NAME = "python314-subgrab-1.0.4-2.5.noarch.rpm"
RPM_HASH = "e095844897f6c205890a16eb471bac5170040885608e22a823e5113a87321c4167622f039c439eef869f2f3eb3257d4ff4e9f01027069ee4b63562224322a045"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-subgrab \
python314-subgrab \
python3dist-subgrab"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-beautifulsoup4 \
python314-lxml \
python314-requests"

inherit rpm
