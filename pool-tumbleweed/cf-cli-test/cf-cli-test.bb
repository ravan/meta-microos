SUMMARY = "Cloud Foundry command line client"
DESCRIPTION = "This is the official command line client for Cloud Foundry."
LICENSE = "Apache-2.0"

PV = "8.18.4+git.0.3fcd823a1"

RPM_NAME = "cf-cli-test-8.18.4+git.0.3fcd823a1-1.1.aarch64.rpm"
RPM_HASH = "d1a27aca24db755cdf4849bac8114f696e9a788dbdf2bf989e85ff87a3d395983b22c899824f5f73ac5decbb5a4799a7cb3b98ac28c6f137fd5a01986f602195"

RPROVIDES:${PN} += "cf-cli-test"

RDEPENDS:${PN} += ""

inherit rpm
