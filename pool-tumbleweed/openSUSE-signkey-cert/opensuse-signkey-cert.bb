SUMMARY = "Certificate for openSUSE KMP signing key"
DESCRIPTION = "This package includes the certificate of openSUSE signing key for signing \
kernel module file (.ko) in openSUSE KMP. This package also calls mokutil \
to help user to enroll certificate to MOK. Then kernel module in openSUSE \
KMP can be verified by kernel."
LICENSE = "GPL-2.0-or-later"

PV = "20230303"

RPM_NAME = "openSUSE-signkey-cert-20230303-3.2.aarch64.rpm"
RPM_HASH = "b5864505839df65e378980786da694aa259ec726bbcd14fdc2fc421942855f2bdfeb084a21ab38cf0730709607daaeee5de5713eae62bdd0a2685486a1217ad6"

RPROVIDES:${PN} += "openSUSE-signkey-cert"

RDEPENDS:${PN} += "/usr/bin/sh \
mokutil"

inherit rpm
