SUMMARY = "Python parser for the CommonMark Markdown spec"
DESCRIPTION = "Pure Python port of jgm's stmd.js, a Markdown parser and renderer for the \
CommonMark specification, using only native modules."
LICENSE = "BSD-3-Clause"

PV = "0.9.2"

RPM_NAME = "python313-CommonMark-0.9.2-1.2.noarch.rpm"
RPM_HASH = "fada3467b48ec56036dc6f7913c6c1d8696d0c2c0a20ec8f3b1ee4eb21357dc537f869cf7a86c22f8284b8f86222207d40f512207a98b95dead5a208825e26e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmark-python \
python3-CommonMark \
python3-commonmark \
python3.13dist-commonmark \
python313-CommonMark \
python313-commonmark \
python3dist-commonmark"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
