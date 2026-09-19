SUMMARY = "Development files for crash"
DESCRIPTION = "This files are required to build extensions for crash. \
 \
Crash is the core analysis suite that can be used to investigate either \
live systems, kernel core dumps created from the netdump and diskdump \
packages from Red Hat Linux, the mcore kernel patch offered by Mission \
Critical Linux, or the LKCD kernel patch. \
 \
 \
 \
Authors: \
-------- \
    David Anderson <anderson@redhat.com>"
LICENSE = "GPL-2.0-or-later"

PV = "9.0.2"

RPM_NAME = "crash-devel-9.0.2-1.6.aarch64.rpm"
RPM_HASH = "8e3d8deeaf618c45b6ca849bf1a75e0bf45200e48ce20f37b30a0b931d6f24bcc54e5a27c513705c547ddfc6a27397cb0f2ccd3e4bd39ade4b62547d3bb1b917"

RPROVIDES:${PN} += "crash-devel"

RDEPENDS:${PN} += "crash \
zlib-devel"

inherit rpm
