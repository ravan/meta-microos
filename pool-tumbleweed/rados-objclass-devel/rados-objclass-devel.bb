SUMMARY = "RADOS object class development kit"
DESCRIPTION = "This package contains libraries and headers needed to develop RADOS object \
class plugins."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "rados-objclass-devel-18.2.7-8.1.noarch.rpm"
RPM_HASH = "a38103f8632fa17d46d3d9a3f9439e4f919d37f7133f80c10915a20f0c262a3088b21e160a312965d14f618c3454dcfe0053ee835b5e78343e7abc31372e3eeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rados-objclass-devel"

RDEPENDS:${PN} += "libradospp-devel"

inherit rpm
