SUMMARY = "Examples for python314-qt3d-qt5"
DESCRIPTION = "This package provides python314-qt3d-qt5 examples."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python314-qt3d-qt5-doc-5.15.6-3.8.noarch.rpm"
RPM_HASH = "ccf0894fe57413a8b16d8ed764b685697630a00ec4d3454ccf959b6489f3e98d4ba106c6b18dd3fd0924be52023bd5e21fc136cad98971eaa4cb468767a04be7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python313-qt3d-qt5-examples \
python314-qt3d-qt5-doc \
python314-qt3d-qt5-examples"

RDEPENDS:${PN} += ""

inherit rpm
