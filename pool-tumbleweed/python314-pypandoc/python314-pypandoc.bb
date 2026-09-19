SUMMARY = "Thin wrapper for pandoc"
DESCRIPTION = "pypandoc provides a thin wrapper for pandoc, a universal document converter."
LICENSE = "MIT"

PV = "1.17"

RPM_NAME = "python314-pypandoc-1.17-1.2.noarch.rpm"
RPM_HASH = "e306bea833106e5fc41a6e6b02b0d9cc9b0aed157beaa236c291dcec19e38a112fcbc4a7c3010386e4a30e6d4132467f367f743580ce7a0ed81be9f7b812792b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pypandoc \
python314-pypandoc \
python3dist-pypandoc"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
pandoc \
python-abi"

inherit rpm
