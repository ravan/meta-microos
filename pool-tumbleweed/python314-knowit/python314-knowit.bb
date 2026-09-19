SUMMARY = "Extract information from video files"
DESCRIPTION = "To extract information from video files."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "python314-knowit-0.6.1-1.1.noarch.rpm"
RPM_HASH = "d982028cb5b24dbee88fd46400cb71ccfbacb2dffa5670954d8f94676f15994deaedff4a3c6b182ac8c7a33fe95af542326101adc32f7a07ee8cc8cfa9ae5885"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-knowit \
python314-knowit \
python3dist-knowit"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Pint \
python314-PyYAML \
python314-babelfish \
python314-enzyme \
python314-pymediainfo \
python314-trakit \
update-alternatives"

inherit rpm
