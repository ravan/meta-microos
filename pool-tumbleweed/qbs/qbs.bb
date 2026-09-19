SUMMARY = "Build tool for software projects"
DESCRIPTION = "Qbs is a tool that helps simplify the build process for developing projects \
across multiple platforms. Qbs can be used for any software project, whether \
it is written with Qt or not. \
 \
Qbs is an all-in one tool that generates a build graph from a high-level \
project description (like qmake or CMake) and additionally undertakes the tasks \
of executing the commands in the low-level build graph (like make). \
 \
This package contains the command line interface. The Qt Creator IDE does \
directly support working qbs projects."
LICENSE = "LGPL-3.0-only"

PV = "3.3.1"

RPM_NAME = "qbs-3.3.1-1.1.aarch64.rpm"
RPM_HASH = "4d637a4bb3717ca75aea72e6b98d4d4bb209eaea9cafcaf8f5ba322f7baa18d81566c0f4639662bb6806afaf29ff251e5ec0eaaf0b02d51876b7847f7f1efb47"

RPROVIDES:${PN} += "libclangcompilationdbgenerator.so \
libgraphvizgenerator.so \
libiarewgenerator.so \
libkeiluvgenerator.so \
libmakefilegenerator.so \
libqbs-cpp-scanner.so \
libqbs-qt-scanner.so \
libqbscore.so.3.3 \
libvisualstudiogenerator.so \
qbs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
