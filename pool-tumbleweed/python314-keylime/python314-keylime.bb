SUMMARY = "Open source TPM software for Bootstrapping and Maintaining Trust"
DESCRIPTION = "Keylime is a TPM based highly scalable remote boot attestation \
and runtime integrity measurement solution."
LICENSE = "Apache-2.0 & MIT & BSD-3-Clause"

PV = "7.14.3"

RPM_NAME = "python314-keylime-7.14.3-1.1.noarch.rpm"
RPM_HASH = "020f1786fd2579533d47e5037640229939d012404e098a15c8af9d9fc6841592190ae31b666decc261c74d36ef355f0f1aa32e1841dfe13556fad8b739a26c0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-keylime \
python314-keylime \
python3dist-keylime"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
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
