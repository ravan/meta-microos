SUMMARY = "SubRip (.srt) subtitle parser and writer"
DESCRIPTION = "pysrt is a python library to search and download subtitles. \
It comes with an easy to use CLI suitable for direct use or cron jobs."
LICENSE = "GPL-3.0-only"

PV = "1.1.2"

RPM_NAME = "python313-pysrt-1.1.2-5.9.noarch.rpm"
RPM_HASH = "f2d7c1771056b1c43bd3936fcecfecc19f490a9eb07901a9350e724c304aea33ff15de64c9a1f3ef599d4f0b0da39bf9c1cef8d9b05f9d4f8afe5aae2ec82b50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pysrt \
python3.13dist-pysrt \
python313-pysrt \
python3dist-pysrt"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-chardet \
update-alternatives"

inherit rpm
