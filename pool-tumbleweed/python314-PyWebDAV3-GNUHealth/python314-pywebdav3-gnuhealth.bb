SUMMARY = "WebDAV library for Python - GNU Health port"
DESCRIPTION = "This is a Python WebDAV implementation (level 1 and 2) that \
features a library for integrating WebDAV server capabilities \
into applications. \
 \
An example on how to use the library is included. This server \
can be run as daemon. \
 \
Port from Andrew Leech PyWebDAV3 library to Support GNU Health."
LICENSE = "GPL-3.0-or-later"

PV = "0.13.0"

RPM_NAME = "python314-PyWebDAV3-GNUHealth-0.13.0-1.4.noarch.rpm"
RPM_HASH = "4b397e8f661fa2ce417696969546f784b91c13e90153131dab2db62b8ef4c324754badb7014420374f0709e3d1f5a99587e9ad0802e48c2fbb0ca823936e4540"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pywebdav3-gnuhealth \
python314-PyWebDAV3-GNUHealth \
python3dist-pywebdav3-gnuhealth"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
