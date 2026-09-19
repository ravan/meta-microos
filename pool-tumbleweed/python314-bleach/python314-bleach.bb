SUMMARY = "A whitelist-based HTML-sanitizing tool"
DESCRIPTION = "Bleach is an HTML sanitation library that escapes or strips markup and \
attributes based on a white list. Bleach can also linkify text safely, applying \
filters that Django's ``urlize`` filter cannot, and optionally setting ``rel`` \
attributes, even on links already in the text. \
 \
Bleach is intended for sanitizing text from *untrusted* sources. \
 \
Because it relies on html5lib, Bleach is as good as modern browsers at dealing \
with weird, quirky HTML fragments. Bleach's methods will fix \
unbalanced or mis-nested tags. \
 \
Documentation is at http://bleach.readthedocs.org/ ."
LICENSE = "Apache-2.0"

PV = "6.4.0"

RPM_NAME = "python314-bleach-6.4.0-1.1.noarch.rpm"
RPM_HASH = "8db38f45e76b376230bff43b5844c9293d602b77810db37bdc11b0f3558ea0cf7f90e3632754fa9409d50a7bee6e7b02c506e39edaea3b5da61cd5649e03fd58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-bleach \
python314-bleach \
python3dist-bleach"

RDEPENDS:${PN} += "python-abi \
python314-html5lib \
python314-webencodings"

inherit rpm
