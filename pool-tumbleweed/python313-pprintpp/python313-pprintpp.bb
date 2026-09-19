SUMMARY = "A variant of pprint that is arguably 'prettier'"
DESCRIPTION = "A drop-in replacement for pprint that is arguably prettier."
LICENSE = "BSD-2-Clause"

PV = "0.4.0"

RPM_NAME = "python313-pprintpp-0.4.0-8.5.noarch.rpm"
RPM_HASH = "7c57d034247692ea19af4645e829d5bba0845b16d946d2fde55635c3d1bd67f549e6268f79a2b665404c097dfc2b2ec160725f2c74a45f8d92f6423a67b3af0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pprintpp \
python3.13dist-pprintpp \
python313-pprintpp \
python3dist-pprintpp"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
