SUMMARY = "Development files for Vinyl Cache"
DESCRIPTION = "Vinyl Cache is an HTTP accelerator. Often called Reverse Proxy, it is \
an application that stores (caches) documents that have been \
requested over the HTTP protocol. \
 \
This package holds the development files for vinyl-cache."
LICENSE = "BSD-2-Clause"

PV = "9.0.1"

RPM_NAME = "vinyl-cache-devel-9.0.1-3.1.aarch64.rpm"
RPM_HASH = "41f36eb6e980750900a098acddd0099f55f116caeb5d62d2cb1611c46f80dd5e2dd0f054a200a1cc1c439a02d54677198a024dbae9b3120b8d28b04760c9af8d"

RPROVIDES:${PN} += "pkgconfig-vinylapi \
vinyl-cache-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
vinyl-cache"

inherit rpm
