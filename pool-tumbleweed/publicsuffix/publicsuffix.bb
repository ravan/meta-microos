SUMMARY = "Cross-vendor public domain suffix database"
DESCRIPTION = "The Public Suffix List is a cross-vendor initiative to provide \
an accurate list of domain name suffixes, maintained by the hard work \
of Mozilla volunteers and by submissions from registries. \
Software using the Public Suffix List will be able to determine where \
cookies may and may not be set, protecting the user from being \
tracked across sites."
LICENSE = "MPL-2.0"

PV = "20260902"

RPM_NAME = "publicsuffix-20260902-1.1.noarch.rpm"
RPM_HASH = "bc1745e7f39d8c90e1321926a07ab6c63482c7f3132628379f5e0177dd8c1e719d7234fa1038e2644e475d62caf1f8ac58ad7aa678d80da86bcb3ac3c7b089cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "publicsuffix"

RDEPENDS:${PN} += ""

inherit rpm
