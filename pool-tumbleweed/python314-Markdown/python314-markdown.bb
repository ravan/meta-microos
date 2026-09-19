SUMMARY = "Python implementation of Markdown"
DESCRIPTION = "This is a Python implementation of John Gruber's [Markdown][]. \
It is almost completely compliant with the reference implementation, \
though there are a few known issues. See [Features][] for information \
on what exactly is supported and what is not. Additional features are \
supported by the [Available Extensions][]."
LICENSE = "BSD-3-Clause"

PV = "3.10.3"

RPM_NAME = "python314-Markdown-3.10.3-1.1.noarch.rpm"
RPM_HASH = "891e739fd90d74b649f50c6de7492316d8b3b31ebe74fff93492b9f5e23fc14b80b77d65caeb346025c95711b78f1eb56093512b82ab455e3beb5a3473f08c1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-markdown \
python314-Markdown \
python3dist-markdown"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
