SUMMARY = "Tool to modify strings to use the same quotes"
DESCRIPTION = "Modifies strings to all use the same (single/double) quote where possible. \
 \
Note that the 'unify' executable has been renamed to 'unify_quotes' to \
avoid conflicts with the wdiff package."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python314-unify-0.5-6.2.noarch.rpm"
RPM_HASH = "3cb5067f02632d64a653c79c8f57209da67811cbb80a0044b81480395b437af3d71224c4472c5b64520f1a9ab4077b955b924cec67ad2cd425f8756bb6ed6c74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-unify \
python314-unify \
python3dist-unify"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-untokenize \
update-alternatives"

inherit rpm
