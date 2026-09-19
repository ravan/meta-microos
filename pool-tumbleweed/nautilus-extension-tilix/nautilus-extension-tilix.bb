SUMMARY = "Nautilus Extension to Open Tilix in Folders"
DESCRIPTION = "This is a Nautilus extension that allows you to open tilix in \
arbitrary folders."
LICENSE = "LGPL-3.0-only & MPL-2.0"

PV = "1.9.6"

RPM_NAME = "nautilus-extension-tilix-1.9.6-2.9.noarch.rpm"
RPM_HASH = "9f325dc7339b0c032cbef07a36ed4b435ecb9ce2344644dcdef59eb0feea0ec05b959e95fdeab5814233a2173c155a2bb47254ddea4619e8acb8114d9e430f80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nautilus-extension-tilix"

RDEPENDS:${PN} += "python3-nautilus"

inherit rpm
