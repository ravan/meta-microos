SUMMARY = "Agama's OpenAPI Specification"
DESCRIPTION = "The OpenAPI Specification (OAS) allows describing an HTTP API in an standard and \
language-agnostic way. This package contains the specification for Agama's HTTP \
API."
LICENSE = "GPL-2.0-or-later"

PV = "24+0.a836cced5"

RPM_NAME = "agama-openapi-24+0.a836cced5-54.1.aarch64.rpm"
RPM_HASH = "6025cc9fc0e1b3470df3649e7f6f6a9bb720c4924476babb77a45674d6cbb4100ece7c0b7927e282bfe495ac143fbac5cbb65e603ed8cc4424bf49f740f78a2c"

RPROVIDES:${PN} += "agama-openapi"

RDEPENDS:${PN} += ""

inherit rpm
