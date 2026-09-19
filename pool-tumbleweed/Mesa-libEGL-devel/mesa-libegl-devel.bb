SUMMARY = "Development files for the EGL API"
DESCRIPTION = "This package contains the development environment required for \
compiling programs against EGL native platform graphics interface \
library. EGL provides a platform-agnostic mechanism for creating \
rendering surfaces for use with other graphics libraries, such as \
OpenGL|ES and OpenVG. \
 \
This package provides the development environment for compiling \
programs against the EGL library."
LICENSE = "MIT"

PV = "26.2.2"

RPM_NAME = "Mesa-libEGL-devel-26.2.2-2.1.aarch64.rpm"
RPM_HASH = "8073ce979aba82f1a00853725d69ea7718cf59ac79e84bfa8d7de531bec430951dfe35abebb49544375b5e263fbc6e985ae1146029c20847db7f47dbf968fd35"

RPROVIDES:${PN} += "Mesa-libEGL-devel \
pkgconfig-egl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-KHR-devel \
Mesa-libEGL1 \
libglvnd-devel \
pkgconfig-x11"

inherit rpm
