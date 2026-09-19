SUMMARY = "Python diff wrapper"
DESCRIPTION = "Python diff wrapper."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python314-moreorless-0.6.0-1.2.noarch.rpm"
RPM_HASH = "96d512cdfb2a21d29b9f6543f25d9696c00f87b5d1c2da4f31dc610238e06d35e454ca2652be58f43e1f4eedaacfc2b0cc2ddcce64f6dc25a1827d643ce4b798"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-moreorless \
python314-moreorless \
python3dist-moreorless"

RDEPENDS:${PN} += "python-abi \
python314-click"

inherit rpm
