SUMMARY = "Widget to display RSS feed"
DESCRIPTION = "Widget to display a RSS feed."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-rss-2.1.5-4.7.noarch.rpm"
RPM_HASH = "e273585cac7b287cc948ae6ba3c149fd1cd5626d5440c42c064a947da59d7f091e8b50e72c1d9e26864bd61727bf40c75118563a388768ea361fcea3260b7e59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-rss"

RDEPENDS:${PN} += "bumblebee-status \
python3-feedparser"

inherit rpm
