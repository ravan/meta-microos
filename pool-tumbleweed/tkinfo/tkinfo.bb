SUMMARY = "Viewer for info-files"
DESCRIPTION = "TkInfo is a tk script to read GNU 'info' files and display them. TkInfo \
can be used stand-alone (via WISH) or embedded within an application to \
provide integrated, online help. \
 \
 \
 \
Authors: \
-------- \
    Axel Boldt <boldt@math.ucsb.edu>"
LICENSE = "SUSE-Public-Domain"

PV = "2.11"

RPM_NAME = "tkinfo-2.11-2.7.noarch.rpm"
RPM_HASH = "5d3faf1e80bf0f9cadb57103ea45656fe3b0ce87a6150fd6504e5f970ce9fcb0832f774d5421a0dc425bf423c0966ad0a4eaa2ab691e07ad0c6eeb4f1e5b3d4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tkinfo"

RDEPENDS:${PN} += "/usr/bin/wish"

inherit rpm
