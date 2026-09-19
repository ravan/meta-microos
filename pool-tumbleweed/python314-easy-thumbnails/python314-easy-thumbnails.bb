SUMMARY = "Easy thumbnails for Django"
DESCRIPTION = "The powerful, yet easy to implement thumbnailing application for Django."
LICENSE = "BSD-2-Clause"

PV = "2.10.1"

RPM_NAME = "python314-easy-thumbnails-2.10.1-1.1.noarch.rpm"
RPM_HASH = "9d0be9b1cde40af17ac4a0498107cbf57c7923e42a2507b37e972fb7c8e7438641ead552bce06108964758105697e5045e9ecc5b8ad8260690f9dc2fb8c5c175"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-easy-thumbnails \
python314-easy-thumbnails \
python3dist-easy-thumbnails"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-Pillow"

inherit rpm
