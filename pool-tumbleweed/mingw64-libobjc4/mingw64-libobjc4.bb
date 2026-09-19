SUMMARY = "MinGW Windows compiler for Objective-C and Objective-C++ shared libraries"
DESCRIPTION = "MinGW Windows compiler for Objective-C and Objective-C++ shared libraries"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw64-libobjc4-16.2.0-1.1.noarch.rpm"
RPM_HASH = "77eb632486a9b1f961f372954fb9e6812051f97e1a5ea83cb91d469686b15367f44b8f956df28cda71f00d079cb0d5b320cc460ff547fea26b4a158ea40e3de5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-libobjc \
mingw64-libobjc-4.dll \
mingw64-libobjc4"

RDEPENDS:${PN} += "mingw64-libgcc-s-seh-1.dll \
mingw64-libwinpthread-1.dll"

inherit rpm
