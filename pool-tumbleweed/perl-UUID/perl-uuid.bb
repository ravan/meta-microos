SUMMARY = "Universally Unique Identifier library for Perl"
DESCRIPTION = "The UUID library is used to generate unique identifiers for objects that \
may be accessible beyond the local system. For instance, they could be used \
to generate unique HTTP cookies across multiple web servers without \
communication between the servers, and without fear of a name clash. \
 \
The generated UUIDs can be reasonably expected to be unique within a \
system, and unique across all systems, and are compatible with those \
created by the Open Software Foundation (OSF) Distributed Computing \
Environment (DCE). \
 \
All generated UUIDs are either version 1, 3, 4, 5, 6, or version 7. And all \
are variant 1, meaning compliant with the OSF DCE standard as described in \
RFC4122. \
 \
Versions 6 and 7 are not yet standardized. They are presented here as \
proposed in RFC4122bis, version 14, and may change in the future. \
RFC4122bis is noted to replace RFC4122, if approved."
LICENSE = "Artistic-2.0"

PV = "0.390.0"

RPM_NAME = "perl-UUID-0.390.0-1.1.aarch64.rpm"
RPM_HASH = "f316552d4f934bc3028ce74c31ca5782604f6cbfb07a656030e64b4ef2f5ea3e21a1e543e55de2decf9a9786320de6749a5f607e2a2d74c314a2a1d3d4b81d42"

RPROVIDES:${PN} += "perl-UUID"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
