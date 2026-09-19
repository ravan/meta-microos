SUMMARY = "Toolkit of common functions used across GrimoireLab"
DESCRIPTION = "Toolkit of common functions used across GrimoireLab projects. \
 \
This package provides a library composed by functions widely used in other \
GrimoireLab projects. These function deal with date handling, introspection, \
URIs/URLs, among other topics."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.5"

RPM_NAME = "python313-grimoirelab-toolkit-1.2.5-1.3.noarch.rpm"
RPM_HASH = "82e07af73232de7b9ab621a18537b411efe7c85525c9d0d04754dfd46bfb8f26dbb8379bbba0c75fe725c7c527e36490658e828c3d8a8e2aa6697ab810477e99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-grimoirelab-toolkit \
python3.13dist-grimoirelab-toolkit \
python313-grimoirelab-toolkit \
python3dist-grimoirelab-toolkit"

RDEPENDS:${PN} += "python-abi \
python313-python-dateutil"

inherit rpm
