SUMMARY = "Livereload server in python"
DESCRIPTION = "Reload webpages on changes, without hitting refresh in your browser."
LICENSE = "BSD-2-Clause"

PV = "2.7.1"

RPM_NAME = "python313-livereload-2.7.1-1.5.noarch.rpm"
RPM_HASH = "9e60d31cbeb683ec2d5b808fe8f45502dceeb1987cb0e0ffb0ee9fca51d571a5d4b1e12e83114455669c849df16cd2e59aa08f2ec5825f7a46fc226fdddc26eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-livereload \
python3.13dist-livereload \
python313-livereload \
python3dist-livereload"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-tornado \
update-alternatives"

inherit rpm
