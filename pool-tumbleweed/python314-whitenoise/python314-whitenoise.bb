SUMMARY = "Static file serving for WSGI applications"
DESCRIPTION = "Static file serving for WSGI applications."
LICENSE = "MIT"

PV = "6.12.0"

RPM_NAME = "python314-whitenoise-6.12.0-1.3.noarch.rpm"
RPM_HASH = "94280f78edbc2a63a1dc288b347a3bfab54879c0424b28e16e40cb7986c7bf2d972a8fec55441b71165064cbcf98e9b454e3d2b55f542f47870c2f13582d31da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-whitenoise \
python314-whitenoise \
python3dist-whitenoise"

RDEPENDS:${PN} += "python-abi"

inherit rpm
