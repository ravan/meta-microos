SUMMARY = "Base Package for Integrated Development Environments"
DESCRIPTION = "This package contains the common plugins for integrated developments \
environment based on the KDevelop framework."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kdevplatform-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "d252ce94f07e3a5b09f9fa11d309d0f0603b2a6aae5b780faee95a873b52298f4fcdec2cb0c65dd53d89ef7a9cfb5a807d4fed52f5468a8fdafcb95559d7e9cc"

RPROVIDES:${PN} += "kdevplatform"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
/usr/bin/zsh \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libc.so.6 \
libkdevplatform66 \
libstdc++.so.6"

inherit rpm
