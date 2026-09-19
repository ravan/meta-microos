SUMMARY = "Development files for python313-Kivy"
DESCRIPTION = "Kivy is a library for development of applications that make use of \
user interfaces, such as multi-touch apps. \
 \
This package contains the headers and source files for extending kivy"
LICENSE = "Apache-2.0 & MIT & LGPL-2.1-or-later & GPL-2.0-or-later & GPL-3.0-only & BSD-3-Clause"

PV = "2.3.1"

RPM_NAME = "python313-Kivy-devel-2.3.1-5.5.aarch64.rpm"
RPM_HASH = "8ee776f5fa8ac3e9051f738b68ad5fbbf52c719ad0352f964857e15ba86e0be45859ccb5fc8dec6a71634d62dbe621e9d6995674e20638461c116062768bb2f4"

RPROVIDES:${PN} += "python3-Kivy-devel \
python313-Kivy-devel"

RDEPENDS:${PN} += "python-abi \
python313-Kivy"

inherit rpm
