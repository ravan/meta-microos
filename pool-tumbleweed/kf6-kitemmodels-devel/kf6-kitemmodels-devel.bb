SUMMARY = "Set of item models extending the Qt model-view framework"
DESCRIPTION = "KItemModels provides a set of item models extending the Qt model-view framework. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kitemmodels-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "cbef5fd07bbd7524e40278fb2bb7b1a7265f9b62e3df1b6a69ea416246466eedab73d0889b3f34a66071dbc567d8236397eae9293599afe19437be2146c169b7"

RPROVIDES:${PN} += "cmake-KF6ItemModels \
kf6-kitemmodels-devel"

RDEPENDS:${PN} += "libKF6ItemModels6"

inherit rpm
