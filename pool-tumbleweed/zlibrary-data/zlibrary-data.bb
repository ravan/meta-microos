SUMMARY = "Data files for Zlibrary"
DESCRIPTION = "This package contains data files for Zlibrary."
LICENSE = "GPL-2.0-or-later"

PV = "0.99.4"

RPM_NAME = "zlibrary-data-0.99.4-5.4.noarch.rpm"
RPM_HASH = "1b7c4b1c944f130bba376d4e20c518cd92d40dc2c703f2e5ea6b5df03f22cb394053e4701fc134764d3943f7a59234046cf1fc7cdf5b8175e96c8dc597da0235"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zlibrary-data"

RDEPENDS:${PN} += ""

inherit rpm
