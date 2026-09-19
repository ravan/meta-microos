SUMMARY = "Examples for python313-qt3d-qt5"
DESCRIPTION = "This package provides python313-qt3d-qt5 examples."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python313-qt3d-qt5-doc-5.15.6-3.8.noarch.rpm"
RPM_HASH = "a8ed7fdf46f8a2c53e2cf671ac3b9f505bb3bf763a85720626e2f7b5115fdd48a4b593f61b0c0d358acee407e8565ad665c5796077c26520d39bc4d1e5fa3df5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-qt3d-qt5-doc \
python313-qt3d-qt5-doc \
python313-qt3d-qt5-examples \
python314-qt3d-qt5-examples"

RDEPENDS:${PN} += ""

inherit rpm
