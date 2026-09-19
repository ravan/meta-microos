SUMMARY = "Kitchen contains a cornucopia of useful code"
DESCRIPTION = "A bunch of useful python functions to be used in other projects."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.6"

RPM_NAME = "python314-kitchen-1.2.6-5.10.noarch.rpm"
RPM_HASH = "a2b3fe0ca18547725f2f4825298505a022c2846c7a46dbbd3936211f49813013ba9fcd3a679cca14088ae54d8ab131f736a66e6ad87195c9ec36da6a7ff5c0d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-kitchen \
python314-kitchen \
python3dist-kitchen"

RDEPENDS:${PN} += "python-abi"

inherit rpm
