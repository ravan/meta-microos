SUMMARY = "Examples for python314-qtcharts-qt5"
DESCRIPTION = "This package provides python314-qtcharts-qt5 examples."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python314-qtcharts-qt5-doc-5.15.6-5.8.noarch.rpm"
RPM_HASH = "1ec93cde401c46126a561ea8e957942e91ec5bb6f5a341071fc0493955af609d33fb050508e46ba7c224ac89829485cc74943c20f6a69ee8a9b99f18acb0127f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python313-qtcharts-qt5-examples \
python314-qtcharts-qt5-doc \
python314-qtcharts-qt5-examples"

RDEPENDS:${PN} += ""

inherit rpm
