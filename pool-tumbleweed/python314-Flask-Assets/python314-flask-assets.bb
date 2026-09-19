SUMMARY = "Asset management for Flask, to compress and merge CSS and Javascript files"
DESCRIPTION = "Integrates the webassets library with Flask, adding support for \
merging, minifying and compiling CSS and Javascript files."
LICENSE = "BSD-2-Clause"

PV = "2.1.0"

RPM_NAME = "python314-Flask-Assets-2.1.0-3.5.noarch.rpm"
RPM_HASH = "17e6e4f2eb4bdbf0a86ed40ffca8f1c31ba67fc99c621f23e24d297209dc2b0f76a99ada1e007bea59d3779073eb65549e93a5a5a89db03915a4b77ceb19748a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flask-assets \
python314-Flask-Assets \
python3dist-flask-assets"

RDEPENDS:${PN} += "python-abi \
python314-Flask \
python314-webassets"

inherit rpm
