SUMMARY = "Documentation for libgpod"
DESCRIPTION = "libgpod is a library meant to abstract access to iPod content. It \
provides an API to retrieve the list of files and \
playlists stored on an iPod, modify them, and save them back to the iPod. \
 \
This package provides development documentation for libgpod."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "libgpod-doc-0.8.3-16.5.noarch.rpm"
RPM_HASH = "00eb9a8fc127cca5c536f039c92a9947dee08073cc33474526851eaf083be1fec4f7d580b648eb06ab493c1a1c453602c5cfea1bc8139cb688ff48d410724206"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgpod-doc"

RDEPENDS:${PN} += ""

inherit rpm
