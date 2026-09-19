SUMMARY = "dict-like structures for Python"
DESCRIPTION = "cooldict provides some dict-like structures for Python, such as \
* a write-through cache around another dict \
* a finalizable dict \
* a branching dict \
* a copy-on-write dict (with and without sinkholing capability)"
LICENSE = "BSD-2-Clause"

PV = "1.04"

RPM_NAME = "python314-cooldict-1.04-2.5.noarch.rpm"
RPM_HASH = "5ce27d1af1482a7b1c99e486f5b0b49a76eb5d501b24d7f0e3024d09037c214cdec7859db884b928224cecc78707ddcb249c371e363ef6ca0d71ea991ede8d07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cooldict \
python314-cooldict \
python3dist-cooldict"

RDEPENDS:${PN} += "python-abi \
python314-ana"

inherit rpm
