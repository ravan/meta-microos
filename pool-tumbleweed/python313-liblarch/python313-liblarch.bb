SUMMARY = "A Python library to handle data structure"
DESCRIPTION = "Liblarch is a Python library built to handle data structure such \
are lists, trees and acyclic graphs (tree where nodes can have multiple \
parents)"
LICENSE = "LGPL-3.0-or-later"

PV = "3.2.0"

RPM_NAME = "python313-liblarch-3.2.0-2.10.noarch.rpm"
RPM_HASH = "4fa22b14fa11172dca00e6de793210694d694168684e9947a5430a43fafca2a3a99a2a1463a67f4d23d292f10530d8bd4a6140aca355eb4fabc93ebc21c94ae0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-liblarch \
python3.13dist-liblarch \
python313-liblarch \
python3dist-liblarch"

RDEPENDS:${PN} += "python-abi \
python313-gobject \
python313-gobject-Gdk"

inherit rpm
