SUMMARY = "PAM authentication in lighttpd"
DESCRIPTION = "A module to provide PAM authentication in lighttpd."
LICENSE = "BSD-3-Clause"

PV = "1.4.85"

RPM_NAME = "lighttpd-mod_authn_pam-1.4.85-1.2.aarch64.rpm"
RPM_HASH = "30385b1300eccb5d9eb5eeb92939c45711b6d8b55e27129b6de8e467193c63cad4bd393f524d641e6a435b91290f70ed902a5db3f5760dbeea538877fae68b2b"

RPROVIDES:${PN} += "lighttpd-mod-authn-pam"

RDEPENDS:${PN} += "libc.so.6 \
libpam.so.0 \
lighttpd"

inherit rpm
