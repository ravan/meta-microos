SUMMARY = "PAM module to manage NTLM credentials in kernel keyring"
DESCRIPTION = "The pam_cifscreds PAM module is a tool for automatically adding \
credentials (username and password) for the purpose of establishing \
sessions in multiuser mounts. \
 \
When a cifs filesystem is mounted with the 'multiuser' option, and does \
not use krb5 authentication, it needs to be able to get the credentials \
for each user from somewhere. The pam_cifscreds module can be used to \
provide these credentials to the kernel automatically at login."
LICENSE = "GPL-3.0-or-later"

PV = "7.7"

RPM_NAME = "pam_cifscreds-7.7-2.1.aarch64.rpm"
RPM_HASH = "94b1c5bb835c16a5880cb609c15f566453fcbc38c61dcab96b0b7c3805e28ba34914febeb7ab715a574c2d5dcf1772fbcd436d2a9a69d75f31e69f153b541ffd"

RPROVIDES:${PN} += "pam-cifscreds"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkeyutils.so.1 \
libpam.so.0 \
libresolv.so.2 \
libtalloc.so.2"

inherit rpm
