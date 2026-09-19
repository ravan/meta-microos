SUMMARY = "RElease NOtes manager"
DESCRIPTION = "Reno is a release notes manager for storing release notes in a git \
repository and then building documentation from them."
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python3-reno-4.1.0-2.4.noarch.rpm"
RPM_HASH = "b38d8ce10fdbbf428be31d8bb9b13e35dcba98261e6569ff3dc19c3aa9898238d3ae2cc755054e792b080f3db57320606b1befcbef517b2d3fbce53281346cb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-reno \
python3.13dist-reno \
python3dist-reno"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python3-PyYAML \
python3-Sphinx \
python3-docutils \
python3-dulwich \
python3-pbr \
python3-six"

inherit rpm
