SUMMARY = "Tool to modify strings to use the same quotes"
DESCRIPTION = "Modifies strings to all use the same (single/double) quote where possible. \
 \
Note that the 'unify' executable has been renamed to 'unify_quotes' to \
avoid conflicts with the wdiff package."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python313-unify-0.5-6.2.noarch.rpm"
RPM_HASH = "5a377f7507d09fd8cf192a56988376efef74b418d8b009edca9de9f3cfe7ddf28a19d0688f16257c3683dbf94e8fcda41e1635785ac7a038a5a5ac272fb13d90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-unify \
python3.13dist-unify \
python313-unify \
python3dist-unify"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-untokenize \
update-alternatives"

inherit rpm
