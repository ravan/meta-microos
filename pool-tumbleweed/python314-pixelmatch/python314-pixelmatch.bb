SUMMARY = "A pixel-level image comparison library"
DESCRIPTION = "A fast pixel-level image comparison library, originally created to compare \
screenshots in tests.  Now with additional support of PIL.Image instances \
Python port of https://github.com/mapbox/pixelmatch. \
 \
mismatch = pixelmatch(img_a, img_b, width, height, data_diff, includeAA=True) \
```"
LICENSE = "ISC"

PV = "0.4.0"

RPM_NAME = "python314-pixelmatch-0.4.0-1.3.noarch.rpm"
RPM_HASH = "1c4be4d51fc3c9ae0fa3447e73613b15ea7753a503fc640e9ce5fe89bd019c20adba75579ca0d10d98c3a70d50c790b32d0eaccddc212ec190cae00bd38fcc94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pixelmatch \
python314-pixelmatch \
python3dist-pixelmatch"

RDEPENDS:${PN} += "python-abi"

inherit rpm
