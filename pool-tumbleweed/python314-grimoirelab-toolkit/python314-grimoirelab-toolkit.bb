SUMMARY = "Toolkit of common functions used across GrimoireLab"
DESCRIPTION = "Toolkit of common functions used across GrimoireLab projects. \
 \
This package provides a library composed by functions widely used in other \
GrimoireLab projects. These function deal with date handling, introspection, \
URIs/URLs, among other topics."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.5"

RPM_NAME = "python314-grimoirelab-toolkit-1.2.5-1.3.noarch.rpm"
RPM_HASH = "02568af6ffb8a60e17be3986abf3934f932cfa6adcec96edefb056c80f626ed96ee0a75c42f8f67f21c1c4bdbe5f64d5abec038246f9c5c0c7424888b8a6c47b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-grimoirelab-toolkit \
python314-grimoirelab-toolkit \
python3dist-grimoirelab-toolkit"

RDEPENDS:${PN} += "python-abi \
python314-python-dateutil"

inherit rpm
