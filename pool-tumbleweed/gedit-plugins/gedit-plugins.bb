SUMMARY = "A collection of plugins for gedit"
DESCRIPTION = "This package contains a number of plugins for gedit, such as: \
 \
 * Smart Spaces: Allows to unindent like if you were using tabs while \
   you're using spaces"
LICENSE = "GPL-2.0-or-later"

PV = "50.0"

RPM_NAME = "gedit-plugins-50.0-1.2.aarch64.rpm"
RPM_HASH = "a7aa21573bc0096fbe097dd504057456f45333d5760050c781ad75856a3e3851793b979d1e6a4b7598c024e660a87d31749f003334f43c2d8a4b6797deec2e57"

RPROVIDES:${PN} += "gedit-plugins"

RDEPENDS:${PN} += "gedit"

inherit rpm
