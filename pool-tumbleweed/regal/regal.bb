SUMMARY = "Linter and language server for Rego"
DESCRIPTION = "Regal is a linter and language server for Rego, making your Rego magnificent, \
and you the ruler of rules! \
 \
With its extensive set of linter rules, documentation and editor integrations, \
Regal is the perfect companion for policy development, whether you're an \
experienced Rego developer or just starting out."
LICENSE = "Apache-2.0"

PV = "0.42.0"

RPM_NAME = "regal-0.42.0-1.1.aarch64.rpm"
RPM_HASH = "7ded6b76113408e8d4fd6d0faa7e9cc10935081c9cd8fb9ab5a9ba1b26588ddde3ad7bc7628aaaae8d824c26c460b71afddc36756320e8cfad8d59d604494df1"

RPROVIDES:${PN} += "regal"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
