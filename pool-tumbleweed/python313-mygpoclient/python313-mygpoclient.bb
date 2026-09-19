SUMMARY = "Python gpodder.net API Client Library"
DESCRIPTION = "The mygpoclient library allows developers to utilize a Pythonic interface to \
the my.gpodder.org web services."
LICENSE = "GPL-3.0-or-later"

PV = "1.10"

RPM_NAME = "python313-mygpoclient-1.10-1.5.noarch.rpm"
RPM_HASH = "43f2321ab8a37d593caa05a072e20363b7f0abcf172b20e1301e65b6a4e01f8156bb806e3c755429a70a223cb70344fc3487076be5e3c492db3144547200632f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mygpoclient \
python3.13dist-mygpoclient \
python313-mygpoclient \
python3dist-mygpoclient"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-simplejson \
update-alternatives"

inherit rpm
