SUMMARY = "A high-level cross-protocol url-grabber"
DESCRIPTION = "A high-level cross-protocol url-grabber for python supporting HTTP, FTP \
and file locations.  Features include keepalive, byte ranges, \
throttling, authentication, proxies and more."
LICENSE = "LGPL-2.1-only"

PV = "4.1.0"

RPM_NAME = "python314-urlgrabber-4.1.0-9.5.noarch.rpm"
RPM_HASH = "55973d4589e2148cfef31b4211a261abb1689e047ea6e1a09d64c27f5f2f725981394b93a83c868087f4336dba2a59e0a479975118beef7598d8670bb11a6b72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-urlgrabber \
python314-urlgrabber \
python3dist-urlgrabber"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-pycurl \
update-alternatives"

inherit rpm
