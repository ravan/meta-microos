SUMMARY = "Install fonts from online sources"
DESCRIPTION = "Font-Downloader is an application allows you to search and install fonts \
directly from the Google Fonts website."
LICENSE = "GPL-3.0-or-later"

PV = "10.0.0"

RPM_NAME = "Font-Downloader-10.0.0-3.2.noarch.rpm"
RPM_HASH = "02a420ac07bfa043d2a0af344dd885f4033af065b8ab075917097b1f3ae3f47c88809fd3576a0c9c6677824d6fd4288337df591984bb857183da45dd743c19a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Font-Downloader"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-gobject-Gdk \
typelib-WebKit2"

inherit rpm
