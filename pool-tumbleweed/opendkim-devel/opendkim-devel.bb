SUMMARY = "Development files to develop with opendkim"
DESCRIPTION = "DomainKeys Identified Mail (DKIM) lets an organization take responsibility for \
a message that is in transit.  The organization is a handler of the message, \
either as its originator or as an intermediary. Their reputation is the basis \
for evaluating whether to trust the message for further handling, such as \
delivery. Technically DKIM provides a method for validating a domain name \
identity that is associated with a message through cryptographic \
authentication. \
 \
This package holds the development files."
LICENSE = "BSD-3-Clause & Sendmail"

PV = "2.11.0"

RPM_NAME = "opendkim-devel-2.11.0-13.5.aarch64.rpm"
RPM_HASH = "dc79a837b180f3159b4b6bba410ddc260b9df80d255b3d3b3d6e2ff6ed2d919d996d0bd5f57f68c435625c180afd3e82e24f7dd3ce4187f8a769234b1e3ca6ff"

RPROVIDES:${PN} += "opendkim-devel \
pkgconfig-opendkim \
pkgconfig-rbl \
pkgconfig-repute \
pkgconfig-ut \
pkgconfig-vbr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopendkim11 \
librbl1 \
librepute1 \
libut1 \
libvbr2 \
opendkim"

inherit rpm
