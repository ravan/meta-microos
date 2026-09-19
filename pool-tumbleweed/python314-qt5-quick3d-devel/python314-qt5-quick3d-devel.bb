SUMMARY = "PyQt - devel part of python bindings for QtQuick3D"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains all the developer tools you need to create your \
own PyQt applications with QtQuick3D"
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.10"

RPM_NAME = "python314-qt5-quick3d-devel-5.15.10-4.6.aarch64.rpm"
RPM_HASH = "c3ce9d47227111793d84ba836d20ab44a21c43f99b3b7e207c903f43a1b5cbe85498cdca8f642d4278f193c73eec286edf6b5de07a33334629063dbbc76a96c4"

RPROVIDES:${PN} += "python314-qt5-quick3d-devel"

RDEPENDS:${PN} += "pkgconfig-Qt5Quick3D \
python-abi \
python314-qt5-devel"

inherit rpm
