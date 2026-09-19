SUMMARY = "Tool to create a timeline of file activity for mounted file systems"
DESCRIPTION = "mac-robber is a digital forensics and incident response tool that can be used \
with The Sleuth Kit to create a timeline of file activity for mounted \
file systems."
LICENSE = "GPL-2.0+"

PV = "1.02"

RPM_NAME = "mac-robber-1.02-14.9.aarch64.rpm"
RPM_HASH = "19725a95a36cbbd252e9e2a57bab7bdad258da3321be25d01d01547cccd364ef448d9f8f828810322775a5918cc0d4a4714b5d0a0760f8fa39fb8bf22b406c7d"

RPROVIDES:${PN} += "mac-robber"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
