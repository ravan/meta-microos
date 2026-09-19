SUMMARY = "YUI CSS compression algorithm"
DESCRIPTION = "This is a Python port of the YUI CSS Compressor."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.2.0"

RPM_NAME = "python314-cssmin-0.2.0-3.5.noarch.rpm"
RPM_HASH = "7567d878bb1a81e62cf88c222f8de2127f9be3e80b901ac0cfaed4a9f83d0ab08306e6ec086c974a4fa6508aabc2951e0010df29c46e8e48fa61b28deed547db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cssmin \
python314-cssmin \
python3dist-cssmin"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
