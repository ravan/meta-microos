SUMMARY = "OpenBSD tool to sign and verify signatures on files (portable version)"
DESCRIPTION = "Signify - Sign and Verify. \
A portable version of the OpenBSD tool to sign and verify signatures on files. \
See http://www.tedunangst.com/flak/post/signify for more information."
LICENSE = "BSD-3-Clause"

PV = "33"

RPM_NAME = "signify-33-1.3.aarch64.rpm"
RPM_HASH = "3569cd2d611417f664b07e5198d7a403454bb0586cf206f7bb37797aecd24517e481d74ee658b0bd082cd414451fc2de2962024b8e4563ad712d2ab1fb127e38"

RPROVIDES:${PN} += "signify"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbsd.so.0 \
libc.so.6"

inherit rpm
