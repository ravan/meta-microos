SUMMARY = "Documentation for the LibreSSL API"
DESCRIPTION = "LibreSSL is an open-source implementation of the Secure Sockets Layer \
(SSL) and Transport Layer Security (TLS) protocols. \
 \
This subpackage contains the manpages to the LibreSSL API."
LICENSE = "OpenSSL"

PV = "4.3.2"

RPM_NAME = "libressl-devel-doc-4.3.2-1.3.noarch.rpm"
RPM_HASH = "32d083168dd8643a81ae681de2fc5a8ccb4330049403bd5f950309fcf88e311edfb9134870791259d282f6a626d5095149200daa36b808a9c3ae094de1d1b3d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libressl-devel-doc \
openssl-doc"

RDEPENDS:${PN} += ""

inherit rpm
