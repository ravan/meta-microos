SUMMARY = "Radio Paradise media server plugin for upmpdcli"
DESCRIPTION = "Media Server plugin providing access to the Radio Paradise streams."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.17"

RPM_NAME = "upmpdcli-radio-paradise-1.9.17-1.5.noarch.rpm"
RPM_HASH = "acf2bb72204c7cc7177f0d0fed888d78697ad5e2a3760321a6365368e1e6aba0cd95f35e29e7e42c7b7c8c27d805853cb469fe827cfbbfbaf59595b69bdf4fbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "upmpdcli-radio-paradise"

RDEPENDS:${PN} += "/usr/bin/env \
python3-requests \
upmpdcli"

inherit rpm
