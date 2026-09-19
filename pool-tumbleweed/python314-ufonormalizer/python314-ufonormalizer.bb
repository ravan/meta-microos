SUMMARY = "Script to normalize the XML and other data inside of a UFO"
DESCRIPTION = "Script to normalize the XML and other data inside of a UFO."
LICENSE = "BSD-3-Clause"

PV = "0.6.3"

RPM_NAME = "python314-ufonormalizer-0.6.3-1.5.noarch.rpm"
RPM_HASH = "bee7c9f4fb7d9220d5c8c27365a09473aa1f0b0a34c020f7b2ae5f7fd5714530251c8f01b909d728e8077ccb387621fa08112942f01e7c1313ac7711c4d961a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ufonormalizer \
python314-ufonormalizer \
python3dist-ufonormalizer"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-setuptools \
update-alternatives"

inherit rpm
