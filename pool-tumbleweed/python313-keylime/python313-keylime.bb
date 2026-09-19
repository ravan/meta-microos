SUMMARY = "Open source TPM software for Bootstrapping and Maintaining Trust"
DESCRIPTION = "Keylime is a TPM based highly scalable remote boot attestation \
and runtime integrity measurement solution."
LICENSE = "Apache-2.0 & MIT & BSD-3-Clause"

PV = "7.14.3"

RPM_NAME = "python313-keylime-7.14.3-1.1.noarch.rpm"
RPM_HASH = "343db76c63e2e5bc794d9f32fee139ac0f5a96e1f868a95f8822d3deda26ed2bc3ca7444d52dd99537c0c644d604aac37d8fb59668c7661e697f6da4bb11da10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-keylime \
python3.13dist-keylime \
python313-keylime \
python3dist-keylime"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
libtss2-tcti-device0 \
libtss2-tcti-tabrmd0 \
procps \
python-abi \
python3-PyYAML \
python3-SQLAlchemy \
python3-alembic \
python3-cryptography \
python3-gpg \
python3-jsonschema \
python3-lark \
python3-packaging \
python3-psutil \
python3-pyasn1 \
python3-pyasn1-modules \
python3-pyzmq \
python3-requests \
python3-tornado \
python3-typing-extensions \
tpm2-0-tss \
tpm2.0-abrmd \
tpm2.0-tools"

inherit rpm
