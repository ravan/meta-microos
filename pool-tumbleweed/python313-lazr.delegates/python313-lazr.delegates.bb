SUMMARY = "Easily write objects that delegate behavior"
DESCRIPTION = "Easily write objects that delegate behavior"
LICENSE = "LGPL-3.0-only"

PV = "2.1.1"

RPM_NAME = "python313-lazr.delegates-2.1.1-1.3.noarch.rpm"
RPM_HASH = "839c764a4cf1f210563394960ba4d007b0017348d301215b2c4bbea4f9e1d74217875fdc2f8d70c62b7a20ad7ede71c0907f2632b9e349d7795f3c7c56cae7af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lazr.delegates \
python3.13dist-lazr.delegates \
python313-lazr.delegates \
python3dist-lazr.delegates"

RDEPENDS:${PN} += "python-abi \
python313-zope.interface"

inherit rpm
