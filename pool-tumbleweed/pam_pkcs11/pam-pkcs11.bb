SUMMARY = "PKCS #11 PAM Module"
DESCRIPTION = "This Linux PAM module allows X.509 a certificate-based user \
authentication. The certificate and its dedicated private key are \
thereby accessed by means of an appropriate PKCS #11 module. For the \
verification of the users' certificates, locally stored CA certificates \
as well as online or locally accessible CRLs are used. \
 \
Additionally, the package includes pam_pkcs11-related tools: \
 \
* pkcs11_eventmgr: Generates actions on card insert, removal, or \
  time-out events \
 \
* pklogin_finder: Gets the login name that maps to a certificate \
 \
* pkcs11_inspect: Inspects the contents of a certificate \
 \
* make_hash_links: Creates hash link directories for storing CAs and \
CRLs"
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.13"

RPM_NAME = "pam_pkcs11-0.6.13-3.3.aarch64.rpm"
RPM_HASH = "1bbd953d06691b9bc40ba58bab1859c61897a3726b912e94e5a16230bb6d5f8bcfab07076dbffd61a6de58156d8f0139e40221c6ad28ef9c200cb525a9c4a148"

RPROVIDES:${PN} += "config-pam-pkcs11 \
pam-pkcs11"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libldap.so.2 \
libnspr4.so \
libnss3.so \
libpam.so.0 \
libpcsclite.so.1 \
libplc4.so \
systemd"

inherit rpm
