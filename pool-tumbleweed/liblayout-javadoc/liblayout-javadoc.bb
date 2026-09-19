SUMMARY = "Javadoc for liblayout"
DESCRIPTION = "Javadoc for liblayout."
LICENSE = "LGPL-2.1-or-later & Unicode"

PV = "0.2.10"

RPM_NAME = "liblayout-javadoc-0.2.10-6.18.noarch.rpm"
RPM_HASH = "2deedfbd267a3fdc607163a3f7c0c74bceccf6a99fef886641236ec99929aea4bb2df592b5941acd0f1589f66b6b112db4eec27d44e294fb46f050e80831f462"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liblayout-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
