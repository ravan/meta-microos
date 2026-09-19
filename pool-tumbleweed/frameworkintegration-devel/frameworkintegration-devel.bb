SUMMARY = "Plugins responsible for better integration of Qt applications in KDE Workspace"
DESCRIPTION = "Framework Integration is a set of plugins responsible for better \
integration of Qt applications when running on a \
KDE Plasma workspace. \
 \
Applications do not need to link to this directly. Development files"
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "frameworkintegration-devel-5.116.0-2.5.aarch64.rpm"
RPM_HASH = "49b3d44fe8172695c48625e3759f43ef279d365d5ab927c4002f5a0d46642b3769ef4a074b83f6ec5a93def640a2dc87d8217963ab5735afe11025fd27e924d3"

RPROVIDES:${PN} += "cmake-KF5FrameworkIntegration \
frameworkintegration-devel"

RDEPENDS:${PN} += "cmake-KF5ConfigWidgets \
cmake-KF5IconThemes \
libKF5Style5"

inherit rpm
