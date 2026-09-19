SUMMARY = "Git credential helper for SMTP on O365 via Himmelblau"
DESCRIPTION = "Applications can link with this library to get Entra Conditional Access tokens \
for authentication and Single-Sign-On from the Himmelblau stack. \
 \
This package contains a git send-email credential helper to authenticate SMTP \
on O365."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "sso-mib-gch-smtp-o365-0.10.1-1.2.aarch64.rpm"
RPM_HASH = "88f5af8ed74d4b14694a0807ee89a4911a2715caa87b48d03f9de09417233341ec7fa8f6ecf3899b906e3866c7d1b9a39be8f955a1f455dec4cb43514b17fd52"

RPROVIDES:${PN} += "sso-mib-gch-smtp-o365"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsso-mib.so.0"

inherit rpm
