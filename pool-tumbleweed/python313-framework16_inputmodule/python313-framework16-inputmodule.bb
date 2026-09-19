SUMMARY = "A library to control input modules on the Framework 16 Laptop"
DESCRIPTION = "A library to control input modules on the Framework 16 Laptop"
LICENSE = "MIT"

PV = "0.2.0+git49"

RPM_NAME = "python313-framework16_inputmodule-0.2.0+git49-2.6.noarch.rpm"
RPM_HASH = "20d868f3ac89ee169ed2c9a7d58a968e09fcb9425a01907e6fd664d7c23ade24cd881f176a6a813c938d80b868c587e52ccc9d2eb848380b8b7ea2ea593d1c99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-framework16-inputmodule \
python3.13dist-inputmodule \
python313-framework16-inputmodule \
python3dist-inputmodule"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
/usr/bin/sh \
alts \
framework-inputmodule-control \
python-abi \
python313-Pillow \
python313-base \
python313-getkey \
python313-pygame \
python313-pyserial \
python313-tk"

inherit rpm
