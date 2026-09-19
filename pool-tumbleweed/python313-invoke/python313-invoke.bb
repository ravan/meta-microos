SUMMARY = "Pythonic Task Execution"
DESCRIPTION = "Invoke is a Python (2.7 and 3.4+) task execution tool & library, drawing \
inspiration from various sources to arrive at a powerful & clean feature set."
LICENSE = "BSD-2-Clause"

PV = "2.2.1"

RPM_NAME = "python313-invoke-2.2.1-1.4.noarch.rpm"
RPM_HASH = "2a57d1438b36abecf8a07c8729097ff2e869e4bea3c3f0fe94ab9dfb29b67f77770e50282785539c8b87ccf5592cc0a4b183b1a88a03c0e78f5fc8e75c2c491f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-invoke \
python3.13dist-invoke \
python313-invoke \
python3dist-invoke"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-PyYAML \
python313-fluidity-sm \
python313-lexicon"

inherit rpm
