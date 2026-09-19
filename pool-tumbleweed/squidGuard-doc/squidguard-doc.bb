SUMMARY = "Documentation and examples for squidGuard"
DESCRIPTION = "This package contains documentation for SquidGuard, a filter, redirector, \
and access controller plugin for squid."
LICENSE = "GPL-2.0-only"

PV = "1.6.0"

RPM_NAME = "squidGuard-doc-1.6.0-3.5.aarch64.rpm"
RPM_HASH = "d5fb798903d688a68a90172be3e09fdb5d503f6e74d5c90ce0eca8a8b1c481b25c1156b44a3c8743f8d5dac097a0cc8265eabc6c1606cd29dcf51cbf67e1eced"

RPROVIDES:${PN} += "squidGuard-doc"

RDEPENDS:${PN} += ""

inherit rpm
