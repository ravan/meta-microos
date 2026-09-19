SUMMARY = "Python Scripting Support for weechat"
DESCRIPTION = "Support for weechat scripts written in the Python language."
LICENSE = "GPL-3.0-or-later"

PV = "4.10.1"

RPM_NAME = "weechat-python-4.10.1-1.1.aarch64.rpm"
RPM_HASH = "d8ceef42b3b1c299cbd03f6fe946324c76e48db9ad97bde0e85f651137d2ba8f3a38f57ad481865e81d9f43c861eff8439fc217ff9053c3990590b67fd9f7ff6"

RPROVIDES:${PN} += "weechat-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.13.so.1.0 \
weechat"

inherit rpm
