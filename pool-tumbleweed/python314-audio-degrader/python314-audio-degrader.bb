SUMMARY = "Tool to introduce controlled degradations to audio"
DESCRIPTION = "Audio degradation toolbox in python. It is used to apply controlled \
degradations to audio."
LICENSE = "GPL-3.0-only"

PV = "1.3.1"

RPM_NAME = "python314-audio-degrader-1.3.1-2.5.noarch.rpm"
RPM_HASH = "b56416ff8b93396e35f033d04a02739111bb00ee8a5a9776814e949b29157a6e51aa64a952d0c1940ce8bc888afde9830c7254245133822a1fdfcc40f2ccc719"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-audio-degrader \
python314-audio-degrader \
python3dist-audio-degrader"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-SoundFile \
python314-scipy \
python314-sox \
update-alternatives"

inherit rpm
