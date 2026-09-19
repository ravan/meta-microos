SUMMARY = "Unified, reliable and easy to use SW library working across NXP MCU portfolio"
DESCRIPTION = "Secure Provisioning SDK (SPSDK) is unified, reliable and easy to use SW library working across NXP MCU portfolio providing strong foundation from quick customer prototyping up to production deployment."
LICENSE = "BSD-3-Clause"

PV = "2.1.1"

RPM_NAME = "python314-spsdk-2.1.1-3.5.noarch.rpm"
RPM_HASH = "2412ea8f4db8a64072c4ca62d0e1c7907031fe815ee864e2fbe558cc65d7f54387404db20d1e109873ee7b1455ea056187cebebe4de1c20ec9e09beeb1355519"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-spsdk \
python314-spsdk \
python3dist-spsdk"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-asn1crypto \
python314-astunparse \
python314-bincopy \
python314-bitstring \
python314-click \
python314-click-command-tree \
python314-click-option-group \
python314-colorama \
python314-crcmod \
python314-cryptography \
python314-deepmerge \
python314-fastjsonschema \
python314-hexdump \
python314-importlib-metadata \
python314-libusbsio \
python314-oscrypto \
python314-platformdirs \
python314-prettytable \
python314-pylink-square \
python314-pyocd \
python314-pyserial \
python314-requests \
python314-ruamel.yaml \
python314-sly \
python314-typing-extensions"

inherit rpm
