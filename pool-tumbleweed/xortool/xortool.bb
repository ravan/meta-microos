SUMMARY = "A tool to analyze multi-byte xor cipher"
DESCRIPTION = "A tool to do some xor analysis: \
 * Guess the key length (based on count of equal chars). \
 * Guess the key (base on knowledge of most frequent char)."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "xortool-1.1.0-1.3.noarch.rpm"
RPM_HASH = "2c0f743f4e0117748d401e7030fc8d6bf7ed88a9686bfe6e2894dd3b028bcebb052544515d5882c558fac1979efe787e8d68349808bdf751593c626b26f7eabb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-xortool \
python3dist-xortool \
xortool"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.13 \
python-abi \
python3-docopt"

inherit rpm
