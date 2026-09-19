SUMMARY = "GAP: The Design Package for GAP"
DESCRIPTION = "The DESIGN package is for constructing, classifying, partitioning and \
studying block designs."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.2"

RPM_NAME = "gap-design-1.8.2-1.6.noarch.rpm"
RPM_HASH = "9d04a5fca85f5005dca67f4b02f1e57b08ef3d2e3fd88f276c8c190b931274df4dd0c34c40101138f6e52b83ed10524095f8e4503fd8ef5cda7ed055a530f404"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-design"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core \
gap-grape"

inherit rpm
