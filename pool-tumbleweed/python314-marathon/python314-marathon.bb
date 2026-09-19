SUMMARY = "Marathon Client Library"
DESCRIPTION = "Python interface to the Mesos Marathon REST API."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python314-marathon-0.13.0-3.11.noarch.rpm"
RPM_HASH = "72bd30794cc103fc7f4065b6ce4a37578d79be5a6e550a2b966811927354fad11b6833c163f446d577ec4a1d2db044291a9a0fa40849c03a76544eeabb8c6397"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-marathon \
python314-marathon \
python3dist-marathon"

RDEPENDS:${PN} += "python-abi \
python314-requests \
python314-requests-toolbelt"

inherit rpm
