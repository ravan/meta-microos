SUMMARY = "Tamil-Brahmi font"
DESCRIPTION = "Adinatha is a  working Unicode Tamil Brahmi font."
LICENSE = "OFL-1.1"

PV = "1.0"

RPM_NAME = "adinatha-fonts-1.0-3.25.noarch.rpm"
RPM_HASH = "639772d165eb4d89c1207367570a09d730b1f523692a2b251b00bf5424bc42873790468ddf6aa1bc2f73c62cfbe629b6740b358f8d4e32fa1ff0b3f2cc8d459c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adinatha-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
