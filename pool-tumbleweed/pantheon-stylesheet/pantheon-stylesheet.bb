SUMMARY = "The Elementary GTK theme"
DESCRIPTION = "The official Granite theme for the Pantheon Desktop, designed to be smooth, \
attractive, fast, and usable."
LICENSE = "GPL-3.0-or-later"

PV = "8.2.2"

RPM_NAME = "pantheon-stylesheet-8.2.2-1.3.noarch.rpm"
RPM_HASH = "eda36d400bea79b3550a2f6727cc695e2ea5c351ebd6dc0f2829dd64815541bb92308472464868638139ad9b32312c34c8dd20e29d2f85272d9251b9d13e3fd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elementary-theme \
pantheon-stylesheet"

RDEPENDS:${PN} += ""

inherit rpm
