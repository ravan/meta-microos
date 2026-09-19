SUMMARY = "Easy thumbnails for Django"
DESCRIPTION = "The powerful, yet easy to implement thumbnailing application for Django."
LICENSE = "BSD-2-Clause"

PV = "2.10.1"

RPM_NAME = "python313-easy-thumbnails-2.10.1-1.1.noarch.rpm"
RPM_HASH = "e924c69d7032ea5231f7420a74c871b36cd8aed8d28d0921ff82401b6564b38c48751ad4b7e8214b6cfabfcca5c68e7644387d160ca292c88debaa3316248452"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-easy-thumbnails \
python3.13dist-easy-thumbnails \
python313-easy-thumbnails \
python3dist-easy-thumbnails"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-Pillow"

inherit rpm
