SUMMARY = "Pure-python HTTP server"
DESCRIPTION = "Cheroot is the pure-Python HTTP server used by CherryPy."
LICENSE = "BSD-3-Clause"

PV = "11.1.2"

RPM_NAME = "python314-cheroot-11.1.2-2.1.noarch.rpm"
RPM_HASH = "238b917f56b6d670aa560a98360d8ad7600c63f6fc6b9667e720455cad282ed6b020f4535cfe5902b3fd57f2fa84e9386bb86be3348f262e04288f007f391d7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cheroot \
python314-Cheroot \
python314-cheroot \
python3dist-cheroot"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-jaraco.functools \
python314-more-itertools"

inherit rpm
