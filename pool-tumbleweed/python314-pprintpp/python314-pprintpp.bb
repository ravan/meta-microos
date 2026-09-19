SUMMARY = "A variant of pprint that is arguably 'prettier'"
DESCRIPTION = "A drop-in replacement for pprint that is arguably prettier."
LICENSE = "BSD-2-Clause"

PV = "0.4.0"

RPM_NAME = "python314-pprintpp-0.4.0-8.5.noarch.rpm"
RPM_HASH = "5a6973f5016bf29dd652cbdcae0147a1bc409b9c2137ad44bcafec601b7876fbb940c31d98386cbc90894a49b307af15668fbf9b4fd665cc651cf3c5441c7464"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pprintpp \
python314-pprintpp \
python3dist-pprintpp"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
