SUMMARY = "Examples for python313-qtdatavis3d-qt5"
DESCRIPTION = "This package provides python313-qtdatavis3d-qt5 examples."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python313-qtdatavis3d-qt5-doc-5.15.5-3.7.noarch.rpm"
RPM_HASH = "d7f88d0158e45fad3e314e3c68bc3bf422989134d1e6b69ac9845de2982d4d143285788eb6b35b99059b5618a76d8a4e44e108be96128598e008b4940e22cb55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-qtdatavis3d-qt5-doc \
python313-qtdatavis3d-qt5-doc \
python313-qtdatavis3d-qt5-examples \
python314-qtdatavis3d-qt5-examples"

RDEPENDS:${PN} += ""

inherit rpm
