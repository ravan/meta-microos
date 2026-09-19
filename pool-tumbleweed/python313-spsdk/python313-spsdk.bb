SUMMARY = "Unified, reliable and easy to use SW library working across NXP MCU portfolio"
DESCRIPTION = "Secure Provisioning SDK (SPSDK) is unified, reliable and easy to use SW library working across NXP MCU portfolio providing strong foundation from quick customer prototyping up to production deployment."
LICENSE = "BSD-3-Clause"

PV = "2.1.1"

RPM_NAME = "python313-spsdk-2.1.1-3.5.noarch.rpm"
RPM_HASH = "6673afb5984e2b25e6a53438aa8cf051d334b89cf01dc3d04c0b6a1d5503b4c298e75a357eaee420cd23071329545f24a3946871b3726244c5c052b3c80f459d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-spsdk \
python3.13dist-spsdk \
python313-spsdk \
python3dist-spsdk"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-asn1crypto \
python313-astunparse \
python313-bincopy \
python313-bitstring \
python313-click \
python313-click-command-tree \
python313-click-option-group \
python313-colorama \
python313-crcmod \
python313-cryptography \
python313-deepmerge \
python313-fastjsonschema \
python313-hexdump \
python313-importlib-metadata \
python313-libusbsio \
python313-oscrypto \
python313-platformdirs \
python313-prettytable \
python313-pylink-square \
python313-pyocd \
python313-pyserial \
python313-requests \
python313-ruamel.yaml \
python313-sly \
python313-typing-extensions"

inherit rpm
