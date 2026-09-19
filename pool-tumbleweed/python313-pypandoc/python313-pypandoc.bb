SUMMARY = "Thin wrapper for pandoc"
DESCRIPTION = "pypandoc provides a thin wrapper for pandoc, a universal document converter."
LICENSE = "MIT"

PV = "1.17"

RPM_NAME = "python313-pypandoc-1.17-1.2.noarch.rpm"
RPM_HASH = "3f1fe08642ef58127d407173b66fbb69eed076824f3f725850bad0f89d8af4225d60f8af06fa2d1ff7524cc5d6ebcecb82b6327ee45ba13ab260e0fc1e34b725"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pypandoc \
python3.13dist-pypandoc \
python313-pypandoc \
python3dist-pypandoc"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
pandoc \
python-abi"

inherit rpm
