SUMMARY = "Examples for python313-qtcharts-qt5"
DESCRIPTION = "This package provides python313-qtcharts-qt5 examples."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python313-qtcharts-qt5-doc-5.15.6-5.8.noarch.rpm"
RPM_HASH = "40cdac9aaa4af89f6a943de0e112a26c6ba4879346a9e371f6583ee57c7238470f4f35bc94b060cb1f40c8a710dad1c4d2ff7dd6c607dfd540a3b356eda1c0e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-qtcharts-qt5-doc \
python313-qtcharts-qt5-doc \
python313-qtcharts-qt5-examples \
python314-qtcharts-qt5-examples"

RDEPENDS:${PN} += ""

inherit rpm
