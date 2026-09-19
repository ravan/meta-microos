SUMMARY = "Japanese online manuals for X11"
DESCRIPTION = "Japanese online manuals for X11 \
 \
 \
 \
Authors: \
-------- \
    X Japanese Documentation Project <xjman-ml@dsl.gr.jp>"
LICENSE = "MIT"

PV = "0.7"

RPM_NAME = "xmanja-0.7-461.24.noarch.rpm"
RPM_HASH = "e379d56d4375495436a339160cf7b351bcd308b2f50c66c328ebf519cc17a5d8d8c5a93f5d167a0cca9b550017b94fd4ba5807c3653dc88cdbc19d0eefd7e3bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xorg-x11-ja \
xmanja"

RDEPENDS:${PN} += ""

inherit rpm
