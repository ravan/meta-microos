SUMMARY = "Asset management for Flask, to compress and merge CSS and Javascript files"
DESCRIPTION = "Integrates the webassets library with Flask, adding support for \
merging, minifying and compiling CSS and Javascript files."
LICENSE = "BSD-2-Clause"

PV = "2.1.0"

RPM_NAME = "python313-Flask-Assets-2.1.0-3.5.noarch.rpm"
RPM_HASH = "04fadbda3b867fb01c0cd1139f60256fbe4666f99cfab8e7f888f39f3462d2834bfcd9abb23f6133e6d030b03bdbfc082b6287fa6b1ca1b81a1833c00e010c35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Assets \
python3.13dist-flask-assets \
python313-Flask-Assets \
python3dist-flask-assets"

RDEPENDS:${PN} += "python-abi \
python313-Flask \
python313-webassets"

inherit rpm
