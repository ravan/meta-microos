SUMMARY = "SubRip (.srt) subtitle parser and writer"
DESCRIPTION = "pysrt is a python library to search and download subtitles. \
It comes with an easy to use CLI suitable for direct use or cron jobs."
LICENSE = "GPL-3.0-only"

PV = "1.1.2"

RPM_NAME = "python314-pysrt-1.1.2-5.9.noarch.rpm"
RPM_HASH = "062a66183303b6ab8827834bb1dd47a66e067c49c9ce5faf49cee8c812737337fc05362feef64fa4fbbbd78cb5749a25e57b006ed3fc350afd7c0b51bccdb165"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pysrt \
python314-pysrt \
python3dist-pysrt"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-chardet \
update-alternatives"

inherit rpm
