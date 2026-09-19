SUMMARY = "The KDE Plasma Workspace Components"
DESCRIPTION = "This package contains the basic packages for a KDE Plasma 6 workspace. \
Development files."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-workspace-devel-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "d3c07b7d3bb86bbd701e145f5cb7a8b5d6b13c1dadc95d727d7ea790069e320c81167acfb66c5ba0e5a071b7fb03fbc037ca3ec2bb984749f60580563c388d86"

RPROVIDES:${PN} += "cmake-KRunnerAppDBusInterface \
cmake-KSMServerDBusInterface \
cmake-Krdb \
cmake-LibKLookAndFeel \
cmake-LibKWorkspace \
cmake-LibNotificationManager \
cmake-LibTaskManager \
plasma5-workspace-devel \
plasma6-workspace-devel"

RDEPENDS:${PN} += "cmake-KF6ItemModels \
cmake-LayerShellQt \
cmake-Plasma \
cmake-Qt6Core \
cmake-Qt6Gui \
cmake-Qt6Quick \
plasma6-workspace-libs"

inherit rpm
