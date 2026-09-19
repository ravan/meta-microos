SUMMARY = "Configuration of NFS, common parts"
DESCRIPTION = "Common data for the NFS client and server modules"
LICENSE = "GPL-2.0-or-later"

PV = "5.0.2"

RPM_NAME = "yast2-nfs-common-5.0.2-1.2.noarch.rpm"
RPM_HASH = "9b6ee80d66113bde924c647df08d794c19889d025ce6158fbf7d304388a0303ecf9fd75e97d8aaffc37ba930b820796615863f5520124fda48238bd82fbeee6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-nfs-common"

RDEPENDS:${PN} += ""

inherit rpm
