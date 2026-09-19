SUMMARY = "Tool to introduce controlled degradations to audio"
DESCRIPTION = "Audio degradation toolbox in python. It is used to apply controlled \
degradations to audio."
LICENSE = "GPL-3.0-only"

PV = "1.3.1"

RPM_NAME = "python313-audio-degrader-1.3.1-2.5.noarch.rpm"
RPM_HASH = "ea40e2fbe66a84921b5ce89f0d8e0c0dc2f7e810ea5e6add9e06f91944188b5ed987816d07e5acefeef9248b869d23c7865addd9fb328f21622e66d403a75fc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-audio-degrader \
python3.13dist-audio-degrader \
python313-audio-degrader \
python3dist-audio-degrader"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-SoundFile \
python313-scipy \
python313-sox \
update-alternatives"

inherit rpm
