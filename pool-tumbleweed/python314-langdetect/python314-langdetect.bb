SUMMARY = "Language detection library ported from Google's language-detection"
DESCRIPTION = "python-langdetect is a port of Google's language-detection library to Python. \
It supports 55 languages out of the box: \
af, ar, bg, bn, ca, cs, cy, da, de, el, en, es, et, fa, fi, fr, gu, he, \
hi, hr, hu, id, it, ja, kn, ko, lt, lv, mk, ml, mr, ne, nl, no, pa, pl, \
pt, ro, ru, sk, sl, so, sq, sv, sw, ta, te, th, tl, tr, uk, ur, vi, zh-cn, zh-tw"
LICENSE = "Apache-2.0"

PV = "1.0.9"

RPM_NAME = "python314-langdetect-1.0.9-3.5.noarch.rpm"
RPM_HASH = "e889aed0d161b812dd9a3aa0db0dc9bb8cc2743a9a8d446ea6849d8586c77313bf8f9e7fdb16b6ac9422ff18856fd5f88fe3c14fda815a89534b17c341bd176b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-langdetect \
python314-langdetect \
python3dist-langdetect"

RDEPENDS:${PN} += "python-abi \
python314-six"

inherit rpm
