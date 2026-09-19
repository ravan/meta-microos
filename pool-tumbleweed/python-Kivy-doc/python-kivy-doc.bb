SUMMARY = "Documentation for Kivy, a multitouch application library"
DESCRIPTION = "Kivy is a library for development of applications that make use of \
user interfaces, such as multi-touch apps."
LICENSE = "Apache-2.0 & MIT & LGPL-2.1-or-later & GPL-2.0-or-later & GPL-3.0-only & BSD-3-Clause"

PV = "2.3.1"

RPM_NAME = "python-Kivy-doc-2.3.1-5.5.noarch.rpm"
RPM_HASH = "f7f4eca61405b9879264934e8b97b1f9910283c82b3a7575fb30cadf58fcb8294d3741f4083739ba737713dff787b0e6050151eb4ef008242ded60e3cb5e3c3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-Kivy-doc \
python313-Kivy-doc \
python314-Kivy-doc"

RDEPENDS:${PN} += ""

inherit rpm
