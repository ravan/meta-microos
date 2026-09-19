SUMMARY = "Widgets for showing progress of asynchronous jobs"
DESCRIPTION = "KJobWIdgets provides widgets for showing progress of asynchronous jobs. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kjobwidgets-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "bd92944ef2b23908f3ce30f93d150b91208912d6a0dd6e04a276783907d49960e719224ca99b495c815fa3f3d801168884fcfbccff7bcbf96df2c0667de4fee7"

RPROVIDES:${PN} += "cmake-KF6JobWidgets \
kf6-kjobwidgets-devel"

RDEPENDS:${PN} += "cmake-KF6CoreAddons \
cmake-Qt6Widgets \
libKF6JobWidgets6"

inherit rpm
