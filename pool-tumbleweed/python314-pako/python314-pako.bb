SUMMARY = "The universal package manager library"
DESCRIPTION = "Often, scripts need to install system dependencies using the native package \
manager of the user's OS. Typically, this is solved by having some bash script \
that runs apt-get, assuming the user is on Ubuntu. Smarter scripts use hand \
crafted code to detect the user's platform and aggregate a set of dependencies \
on a few of the more popular platforms. Our approach is different: \
  * Parse package format (devel/debug/normal library or executable) \
  * Look up package managers that exist in PATH \
  * Format parsed package with common package convention of package manager \
 \
More on https://github.com/MycroftAI/pako"
LICENSE = "Apache-2.0"

PV = "0.3.1"

RPM_NAME = "python314-pako-0.3.1-3.5.noarch.rpm"
RPM_HASH = "3e207f83415f04981e9f73171dd97f9d0e74803217d7e922ecab12017d0d434f404c1709848b08408541f5d082c978b250ca7a5df53d9e065ab3f46ea396d994"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pako \
python314-pako \
python3dist-pako"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-appdirs"

inherit rpm
