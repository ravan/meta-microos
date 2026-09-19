SUMMARY = "Plugins responsible for better integration of Qt applications in KDE Workspace"
DESCRIPTION = "Framework Integration is a set of plugins responsible for better \
integration of Qt applications when running on a \
KDE Plasma workspace. \
 \
Applications do not need to link to this directly. Development files"
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-frameworkintegration-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "33978d68e8d3285f68c9fc8719a09edee03ae03ceac88506699ba6e784983b885c378e1fd9a258b46ec28feea5d01da2b06a81bcd5b411e77001855ccef920ea"

RPROVIDES:${PN} += "cmake-KF6FrameworkIntegration \
kf6-frameworkintegration-devel"

RDEPENDS:${PN} += "cmake-KF6ColorScheme \
cmake-KF6IconThemes \
cmake-KF6WidgetsAddons \
libKF6Style6"

inherit rpm
