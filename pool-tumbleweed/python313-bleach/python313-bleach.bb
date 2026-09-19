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

RPM_NAME = "python313-bleach-6.4.0-1.1.noarch.rpm"
RPM_HASH = "f1735fcb23c6de9a74a4e783e580a98ec1c4802e7109a82c316e6438462657d74db8cad6abdc64a2771267064e953ecd1fd923bfc25a9425574b0edb2736ed2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bleach \
python3.13dist-bleach \
python313-bleach \
python3dist-bleach"

RDEPENDS:${PN} += "python-abi \
python313-html5lib \
python313-webencodings"

inherit rpm
