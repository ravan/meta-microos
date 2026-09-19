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

RPM_NAME = "python313-PyWebDAV3-GNUHealth-0.13.0-1.4.noarch.rpm"
RPM_HASH = "19308ff7abc94fa74637970d5ab4955af2437af073fa6c76f965260ef89daa83065967cbc8c030041ba75df3250766086505f1368ff586a61422a9da0b891330"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyWebDAV3-GNUHealth \
python3.13dist-pywebdav3-gnuhealth \
python313-PyWebDAV3-GNUHealth \
python3dist-pywebdav3-gnuhealth"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
