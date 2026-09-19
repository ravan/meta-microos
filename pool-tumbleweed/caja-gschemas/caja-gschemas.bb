SUMMARY = "Caja GSchemas"
DESCRIPTION = "Caja is the official file manager for the MATE desktop. It allows to \
browse directories, preview files and launch applications associated \
with them. It is also responsible for handling the icons on the MATE \
desktop. It works on local and remote filesystems. \
 \
This package provides the GSettings schemas for Caja."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.28.0"

RPM_NAME = "caja-gschemas-1.28.0-1.14.aarch64.rpm"
RPM_HASH = "ad14af93b5f8d31807cedffc798d3022df017d78c80ee9c3320f4e0577883183e49735cbfe2e699d957f1382912a6536377871676b55776a9e0bf3e727b38158"

RPROVIDES:${PN} += "caja-gschemas \
caja-gsettings-schemas"

RDEPENDS:${PN} += ""

inherit rpm
