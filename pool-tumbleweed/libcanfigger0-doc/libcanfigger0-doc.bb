SUMMARY = "Documentation for canfigger"
DESCRIPTION = "This package contains the HTML documentation for canfigger"
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "libcanfigger0-doc-0.3.2-1.3.noarch.rpm"
RPM_HASH = "6541a87fc9f67f6d3609e2bc2a1bcafc5c14e4c69b225d7c3db81cde5481c7c0763fdf354fca9719d8ed802518953746578ea6d2cd6e47b10b2d8160edc171f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libcanfigger0-doc"

RDEPENDS:${PN} += ""

inherit rpm
