SUMMARY = "Rime's configuration manager"
DESCRIPTION = "Plum is rime's configuration manager in golang."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.3"

RPM_NAME = "rime-plum-1.0.3-2.8.aarch64.rpm"
RPM_HASH = "3098c6d23943f8c4da9ecfe6a926f944f1e3d0ab8cd8da6372483f0c4abcc1f26746895dddc43dd9e76b5657f64483308ba6fb3a92a295456daa7044c58536c0"

RPROVIDES:${PN} += "rime-plum"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
