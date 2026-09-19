SUMMARY = "Visual Tcl"
DESCRIPTION = "Visual Tcl is a freely-available, high-quality application development \
environment for UNIX, Windows, and Macintosh platforms. Writing \
entirely in Tcl and generating pure Tcl should make porting either \
unnecessary or trivial. \
 \
 \
 \
Authors: \
-------- \
    Stewart Allen <stewart@neuron.com>"
LICENSE = "GPL-2.0+"

PV = "1.6.1a1"

RPM_NAME = "vtcl-1.6.1a1-197.7.noarch.rpm"
RPM_HASH = "af96eadaa4f79a87cd805d43222fbbe92081a13a157f43cba05f3519176549cb7e3d141c6e69e05f3bde8b3b85f9820baa422667c1a71fc575258c980304012d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vtcl"

RDEPENDS:${PN} += "/usr/bin/sh \
tcl \
tix \
tk \
xdg-utils"

inherit rpm
