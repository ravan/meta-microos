SUMMARY = "Language detection library ported from Google's language-detection"
DESCRIPTION = "python-langdetect is a port of Google's language-detection library to Python. \
It supports 55 languages out of the box: \
af, ar, bg, bn, ca, cs, cy, da, de, el, en, es, et, fa, fi, fr, gu, he, \
hi, hr, hu, id, it, ja, kn, ko, lt, lv, mk, ml, mr, ne, nl, no, pa, pl, \
pt, ro, ru, sk, sl, so, sq, sv, sw, ta, te, th, tl, tr, uk, ur, vi, zh-cn, zh-tw"
LICENSE = "Apache-2.0"

PV = "1.0.9"

RPM_NAME = "python313-langdetect-1.0.9-3.5.noarch.rpm"
RPM_HASH = "48f0d53725cbf47cf761b717863b7dcc98756e5eaa68d01b275a3949bb4a96b06abdfae9a4cf20488b2ad2feed81439a09706a3008e0985c9d776bd297ab3bfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-langdetect \
python3.13dist-langdetect \
python313-langdetect \
python3dist-langdetect"

RDEPENDS:${PN} += "python-abi \
python313-six"

inherit rpm
