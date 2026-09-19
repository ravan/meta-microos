SUMMARY = "PHP plugin for Kdevelop5 Integrated Development Environment"
DESCRIPTION = "PHP plugin for Kdevelop Integrated Development Environment \
 \
This plugin enables support for the following features for developing \
web applications in PHP using Kdevelop5. \
 \
  * PHP built-in functions, classes, constants, superglobals \
  * user-defined functions, classes, constants, superglobals, variables, etc. \
  * proper code completion for objects which respects access modifiers (private, \
    public, protected) and differentiates between static/non-static members and \
    methods \
  * code completion for overridable and implementable functions inside classes \
  * hints in the argument list of function- and method class \
  * sane code completion after keywords such as extends, implements, catch(), \
    new, throw and some more"
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kdevelop-plugin-php-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "dcaa8fbe28c93b9b941a9bba3428f2189317254a3a3e2d62d6ab657f865fd0aa6f4f1a619b65ad3aa13ae76aa8dbf0b28e07439404164dc5bd374d5e06154e78"

RPROVIDES:${PN} += "kdevelop-plugin-php \
libkdevphpcompletion.so \
libkdevphpduchain.so \
libkdevphpparser.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
kdevelop \
ld-linux-aarch64.so.1 \
libKDevPlatformDocumentation.so.66 \
libKDevPlatformInterfaces.so.66 \
libKDevPlatformLanguage.so.66 \
libKDevPlatformOutputView.so.66 \
libKDevPlatformProject.so.66 \
libKDevPlatformSerialization.so.66 \
libKDevPlatformUtil.so.66 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOWidgets.so.6 \
libKF6TextEditor.so.6 \
libKF6ThreadWeaver.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
