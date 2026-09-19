SUMMARY = "Documentation for qt6-webengine in HTML format"
DESCRIPTION = "This package contains documentation for qt6-webengine in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-webengine-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "faec9bf5aadf7237ce6e5576f6548d15ce2cd9711907aa5728955b98886a853b27aacf15c415f529280b92229723a8ddf4b597c9db1987c38f7083f8cc985cb0"

RPROVIDES:${PN} += "qt6-webengine-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
