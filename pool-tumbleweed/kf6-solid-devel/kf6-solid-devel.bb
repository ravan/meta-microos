SUMMARY = "KDE Desktop hardware abstraction: Build Environment"
DESCRIPTION = "Solid is a device integration framework. It provides a way of querying and \
interacting with hardware independently of the underlying operating system. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-solid-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "0dc5e1353a7921f903b1df19f60c9ecd4faa67f79b83db117cedf3469554d0478d1cf421b57e49bab29bfa318bc7c74a56788c94551de8073c56693617e4c2dd"

RPROVIDES:${PN} += "cmake-KF6Solid \
kf6-solid-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
libKF6Solid6"

inherit rpm
