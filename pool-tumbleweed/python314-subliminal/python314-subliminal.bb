SUMMARY = "Python library to search and download subtitles"
DESCRIPTION = "Subliminal is a python library to search and download subtitles. \
It comes with an easy to use CLI suitable for direct use or cron jobs."
LICENSE = "MIT"

PV = "2.7.1"

RPM_NAME = "python314-subliminal-2.7.1-1.1.noarch.rpm"
RPM_HASH = "eff9c944b38c59de5b92ef369fc616f580775bdc1f352b656aa53bfe21eeeba6fbe46706963b19cf96c9107bb518fe9c47b68efc15f0e4dff67c0483429751cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-subliminal \
python314-subliminal \
python3dist-subliminal \
subliminal"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-babelfish \
python314-beautifulsoup4 \
python314-chardet \
python314-click \
python314-click-option-group \
python314-defusedxml \
python314-dogpile.cache \
python314-guessit \
python314-knowit \
python314-platformdirs \
python314-pysubs2 \
python314-requests \
python314-srt \
python314-stevedore \
python314-tomlkit \
update-alternatives"

inherit rpm
