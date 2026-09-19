SUMMARY = "A high-level cross-protocol url-grabber"
DESCRIPTION = "A high-level cross-protocol url-grabber for python supporting HTTP, FTP \
and file locations.  Features include keepalive, byte ranges, \
throttling, authentication, proxies and more."
LICENSE = "LGPL-2.1-only"

PV = "4.1.0"

RPM_NAME = "python313-urlgrabber-4.1.0-9.5.noarch.rpm"
RPM_HASH = "8ba8f93345d90a3fe9107fc32dad9ee5be5ff9f55e3bb4b42a0d9a7291fd826cf67bb141ad7bc7396786599e5d0544afdf53da67b1eb41b9d089af8dc06d7046"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-urlgrabber \
python3.13dist-urlgrabber \
python313-urlgrabber \
python3dist-urlgrabber"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-pycurl \
update-alternatives"

inherit rpm
