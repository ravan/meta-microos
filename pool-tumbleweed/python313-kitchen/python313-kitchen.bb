SUMMARY = "Kitchen contains a cornucopia of useful code"
DESCRIPTION = "A bunch of useful python functions to be used in other projects."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.6"

RPM_NAME = "python313-kitchen-1.2.6-5.10.noarch.rpm"
RPM_HASH = "ea2b74ee97e977182d18a52026410cfacd451e16868db9a3d5be46d1b6138fd31ffae9f1e53cd28d338720a0701389da3dabc1235cc734067fdc458f2df936ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kitchen \
python3.13dist-kitchen \
python313-kitchen \
python3dist-kitchen"

RDEPENDS:${PN} += "python-abi"

inherit rpm
