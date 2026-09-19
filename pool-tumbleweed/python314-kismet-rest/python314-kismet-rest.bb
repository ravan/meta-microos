SUMMARY = "Python wrapper for the Kismet REST interface"
DESCRIPTION = "Simplified Python API for the Kismet REST interface."
LICENSE = "GPL-2.0-only"

PV = "2019.05.02"

RPM_NAME = "python314-kismet-rest-2019.05.02-3.5.noarch.rpm"
RPM_HASH = "35b91d2eba1169465732e41a93b3cb8acb76fd612d46402b5871afa0b46b25d3236b735459f3dba9d02d81eaac182b55475d41c9a76d1b6cc1679a8eba1120b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-kismet-rest \
python314-kismet-rest \
python3dist-kismet-rest"

RDEPENDS:${PN} += "python-abi \
python314-requests"

inherit rpm
