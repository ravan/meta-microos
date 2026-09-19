SUMMARY = "A mock code autogenerator for Go"
DESCRIPTION = "mockery provides the ability to easily generate mocks for Golang interfaces \
using the stretchr/testify/mock package. It removes the boilerplate coding \
required to use mocks."
LICENSE = "BSD-3-Clause"

PV = "2.53.5"

RPM_NAME = "mockery-2.53.5-1.8.aarch64.rpm"
RPM_HASH = "e3718b881b5ef0fa06ef3884bdb4ec0fd315045ca484d9ef40272cafdb86186831d55b07beb2ba6693414b4cafbf7d3676382ce0db99fb58147a6592e2e2baf1"

RPROVIDES:${PN} += "mockery"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
