SUMMARY = "Activity files for gcompris-qt"
DESCRIPTION = "This package contains the bundle of activities for gcompris-qt. \
More than 100 activities are available."
LICENSE = "AGPL-3.0-or-later & CC-BY-4.0 & Apache-2.0 & MPL-2.0 & OFL-1.1 & GFDL-1.2-or-later & MIT & CC0-1.0 & BSD-2-Clause & BSD-3-Clause"

PV = "26.1"

RPM_NAME = "gcompris-qt-activities-26.1-1.2.noarch.rpm"
RPM_HASH = "369aed0df9366656baf13b61cde562fb9dcca4be0bda1fe888ccf8e60054bf337b09e44368e6e819a37213118f2e6f4c94c739ef5a4fa17b60c64bc4fec38443"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcompris-qt-activities"

RDEPENDS:${PN} += "gcompris-qt"

inherit rpm
