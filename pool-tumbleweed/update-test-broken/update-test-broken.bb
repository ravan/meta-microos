SUMMARY = "Test update which should not be installable"
DESCRIPTION = "Package for testing the update stack during product development. \
 \
An update for this package should fail."
LICENSE = "GPL-2.0-or-later"

PV = "5.2"

RPM_NAME = "update-test-broken-5.2-1.15.aarch64.rpm"
RPM_HASH = "4fc4f7060ec912bd06288eba0c46e82ec1f7c92dc84fd0e1862935408474519dca76a2ec4c6b41e9f141b7db82d8a0a0c7f6a87003fbbc7d4ecdc890ee116572"

RPROVIDES:${PN} += "update-test-broken"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
