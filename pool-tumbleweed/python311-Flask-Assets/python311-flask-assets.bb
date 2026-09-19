SUMMARY = "Asset management for Flask, to compress and merge CSS and Javascript files"
DESCRIPTION = "Integrates the webassets library with Flask, adding support for \
merging, minifying and compiling CSS and Javascript files."
LICENSE = "BSD-2-Clause"

PV = "2.1.0"

RPM_NAME = "python311-Flask-Assets-2.1.0-3.3.noarch.rpm"
RPM_HASH = "e278f2f0a00cf6798a824dfb233e657f9502dc69da5ee14a3ae5a090789144839688b410a4e4c4538f78e8fb0b2c52d65e0cab0dd9fb3bde5d49f83ea0f1c545"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-flask-assets \
python311-Flask-Assets \
python3dist-flask-assets"

RDEPENDS:${PN} += "python-abi \
python311-Flask \
python311-webassets"

inherit rpm
