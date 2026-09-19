SUMMARY = "OSSP's Universally Unique Identifier generator"
DESCRIPTION = "OSSP uuid is a ISO C99 application programming interface (API) and \
corresponding command line interface (CLI) for the generation of DCE 1.1, \
ISO/IEC 11578:1996 and RFC 4122 compliant Universally Unique Identifier (UUID). \
It supports DCE 1.1 variant UUIDs of version 1 (time and node based), version 3 \
(name based, MD5), version 4 (random number based) and version 5 (name based, \
SHA-1). Additional API bindings are provided for the languages ISO C++98, \
Perl 5 and PHP 4/5. Optional backward compatibility exists for the ISO C \
DCE-1.1 and Perl Data::UUID APIs. \
 \
UUIDs are 128-bit numbers which are intended to have a high likelihood of \
uniqueness over space and time and are computationally difficult to guess. They \
are globally unique identifiers which can be locally generated without \
contacting a global registration authority. UUIDs are intended as unique \
identifiers for both mass tagging objects with an extremely short lifetime and \
to reliably identifying very persistent objects across a network."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "ossp-uuid-1.6.2-20.14.aarch64.rpm"
RPM_HASH = "8fa75d4386a2872842d7a4aa4e5f141f740a4ce97e3a2fc37e9e793cbf8ac805b1d5f41bfd6fc6783f2dadb32288ffb1eb6ff4c4acbc66d0c7ea950da1a4b2df"

RPROVIDES:${PN} += "ossp-uuid \
uuid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libossp-uuid.so.16"

inherit rpm
