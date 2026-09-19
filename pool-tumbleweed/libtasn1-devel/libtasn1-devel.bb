SUMMARY = "Development files for the ASN.1 parsing library"
DESCRIPTION = "This is the ASN.1 library used by GNUTLS. Abstract Syntax Notation One (ASN.1) \
is a standardized data description and serialization language. \
 \
This package contains files required to build against libtasn1."
LICENSE = "GFDL-1.3-or-later & LGPL-2.1-or-later"

PV = "4.21.0"

RPM_NAME = "libtasn1-devel-4.21.0-1.5.aarch64.rpm"
RPM_HASH = "76dac837066dc0af11aeb6b87ffeb207e39fc7ab685a3ae12a14b786e82f9e3f64d7aa731f2d7db8319e7b8307fc1b08f67bc35aca5c2b64de46825b360068e5"

RPROVIDES:${PN} += "libtasn1-devel \
pkgconfig-libtasn1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtasn1-6"

inherit rpm
