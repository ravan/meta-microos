SUMMARY = "Python library to search and download subtitles"
DESCRIPTION = "Subliminal is a python library to search and download subtitles. \
It comes with an easy to use CLI suitable for direct use or cron jobs."
LICENSE = "MIT"

PV = "2.7.1"

RPM_NAME = "python313-subliminal-2.7.1-1.1.noarch.rpm"
RPM_HASH = "2b967e62585d413012831456b66721cd9da3f4d56c1e160c33e1a918cb9f2a4073126847fc5f12d9c32e5707305b5471a325e0a4f167a84f2d4e94a51c950142"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-subliminal \
python3.13dist-subliminal \
python313-subliminal \
python3dist-subliminal \
subliminal"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-babelfish \
python313-beautifulsoup4 \
python313-chardet \
python313-click \
python313-click-option-group \
python313-defusedxml \
python313-dogpile.cache \
python313-guessit \
python313-knowit \
python313-platformdirs \
python313-pysubs2 \
python313-requests \
python313-srt \
python313-stevedore \
python313-tomlkit \
update-alternatives"

inherit rpm
