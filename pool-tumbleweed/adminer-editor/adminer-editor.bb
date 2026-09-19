SUMMARY = "Data manipulation for end-users"
DESCRIPTION = "Adminer Editor is both easy-to-use and user-friendly database data editing tool \
written in PHP. It is suitable for common users, as it provides high-level data \
manipulation."
LICENSE = "GPL-2.0-only | Apache-2.0"

PV = "4.8.1"

RPM_NAME = "adminer-editor-4.8.1-1.13.noarch.rpm"
RPM_HASH = "72c308ca313b066b8a8e770fb593c9df3013eab7b9d464592e40d2b54404a2cf4dfed3835e305b3f9dcb5a0a25437255ba854c06c1fe9316709e4e41b14710ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adminer-editor"

RDEPENDS:${PN} += "adminer"

inherit rpm
