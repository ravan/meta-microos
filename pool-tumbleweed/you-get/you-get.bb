SUMMARY = "Dumb downloader that scrapes the web"
DESCRIPTION = "You-Get is a command-line utility to download media contents \
(videos, audios, images) from the Web, in case there is no other \
handy way to do it."
LICENSE = "MIT"

PV = "0.4.1743"

RPM_NAME = "you-get-0.4.1743-3.1.noarch.rpm"
RPM_HASH = "085af57336c0cdab50c2606489ff39f30fd8f7646657e0412828acaa6a058e8b44e3c3f306a64a6157e2e2b7443af56efddfc4a342f58fe10e4d572563f308d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-you-get \
python3dist-you-get \
you-get"

RDEPENDS:${PN} += "/usr/bin/python3 \
ffmpeg \
python-abi \
python3-dukpy"

inherit rpm
