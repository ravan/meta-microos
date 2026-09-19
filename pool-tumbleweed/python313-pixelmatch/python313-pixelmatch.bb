SUMMARY = "A pixel-level image comparison library"
DESCRIPTION = "A fast pixel-level image comparison library, originally created to compare \
screenshots in tests.  Now with additional support of PIL.Image instances \
Python port of https://github.com/mapbox/pixelmatch. \
 \
mismatch = pixelmatch(img_a, img_b, width, height, data_diff, includeAA=True) \
```"
LICENSE = "ISC"

PV = "0.4.0"

RPM_NAME = "python313-pixelmatch-0.4.0-1.3.noarch.rpm"
RPM_HASH = "c91e35ee1a9ba9e35c6ce492f3ea2f3807b638352a9a1b44507882041fa9a4f37ef7494782abe1b56c63b0c8e2e1453290e34b87e0564fe924a5765905ea9273"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pixelmatch \
python3.13dist-pixelmatch \
python313-pixelmatch \
python3dist-pixelmatch"

RDEPENDS:${PN} += "python-abi"

inherit rpm
