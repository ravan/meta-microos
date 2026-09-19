SUMMARY = "TK-Interface for cron and at"
DESCRIPTION = "TK-Interface for cron and at. \
 \
 \
 \
Authors: \
-------- \
    Daniel Roche <dan@lectra.com>"
LICENSE = "GPL-2.0-or-later"

PV = "2.3"

RPM_NAME = "vcron-2.3-283.7.noarch.rpm"
RPM_HASH = "3ad3d9d1c74fd265ed8d9c7c5f57bcb2b9d3e23c7e860a1cdbd76b670ddb6dd283815410a550e44f5b1c284beb4a9e81b596de908128107ba783e4f9b80bd636"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vcron"

RDEPENDS:${PN} += "/usr/bin/sh \
at \
cron \
freetype2 \
tcl \
tk"

inherit rpm
