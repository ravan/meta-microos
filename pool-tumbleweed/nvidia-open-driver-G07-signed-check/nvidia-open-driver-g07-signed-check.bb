SUMMARY = "Post-build RPM inspection"
DESCRIPTION = "This subpackage runs post-build verification on generated RPMs."
LICENSE = "GPL-2.0-only & MIT"

PV = "595.99.02"

RPM_NAME = "nvidia-open-driver-G07-signed-check-595.99.02-2.2.noarch.rpm"
RPM_HASH = "d38cbe58332986e23b59accdd6562eb2a1411027a2e9dca04541e77aa7ef8d0136e569ddf9a6f13e4818281b5772de3ea6fe87558d8036bbcba66c8a2514a573"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nvidia-open-driver-G07-signed-check"

RDEPENDS:${PN} += "/usr/bin/sh \
bash"

inherit rpm
