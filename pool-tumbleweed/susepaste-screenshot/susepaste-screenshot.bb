SUMMARY = "Script for pasting screenshots"
DESCRIPTION = "A script for using the openSUSE paste service. \
You can paste screenshot of the window or whole desktop."
LICENSE = "GPL-3.0-only"

PV = "20241225"

RPM_NAME = "susepaste-screenshot-20241225-1.6.noarch.rpm"
RPM_HASH = "c214becfbb81855c17a8cce140c39183c3676fbfc1433feb6a635c96644985743fd927f85b19021afe4be41ec4f07891020ddffc3c960a5626ef62c1f15298fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "susepaste-screenshot"

RDEPENDS:${PN} += "/usr/bin/sh \
ImageMagick \
curl \
wmctrl"

inherit rpm
