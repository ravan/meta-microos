SUMMARY = "Documentation for GLFW, an OpenGL application framework"
DESCRIPTION = "GLFW is a framework for OpenGL application development. It is a \
single library providing a powerful, portable API for otherwise \
operating system specific tasks such as opening an OpenGL window, and \
reading keyboard, time, mouse and joystick input. \
 \
This subpackage contains GLFW's documentation in html format."
LICENSE = "Zlib"

PV = "3.5.1"

RPM_NAME = "glfw-doc-3.5.1-1.1.noarch.rpm"
RPM_HASH = "f573028ed7d03ff81acfcfb1a7ae57d225db7052ad2fdd54f529887256a67355a0647ccb74a8de2a1364b46a0cac1ba0fef85720f4a11fc78ab595f552ffcf2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glfw-doc"

RDEPENDS:${PN} += ""

inherit rpm
