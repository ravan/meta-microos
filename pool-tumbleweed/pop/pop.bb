SUMMARY = "Program to send emails from a terminal"
DESCRIPTION = "A program to send emails from a terminal. \
To use pop, a RESEND_API_KEY is required, or an SMTP host needs to be \
configured."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "pop-0.2.1-1.4.aarch64.rpm"
RPM_HASH = "80752b0ca6b0b0fc9a614b80ec2663f3906d6f18220d3f5b72fb6bc53ba5165af3e5e71a466d1b1fb435a98c4c8e3a58828a4b33ff23e3d64da92d21a61a1f05"

RPROVIDES:${PN} += "pop"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
