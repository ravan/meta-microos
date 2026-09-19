SUMMARY = "AI-powered changelog generation from code changes"
DESCRIPTION = "An AI-powered changelog generator that uses fine-tuned T5 models to create \
human-readable changelog entries from code changes. It integrates with both \
OSC (Open Build Service) and Git repositories, providing automated changelog \
generation for software development workflows."
LICENSE = "Apache-2.0"

PV = "0.1.2"

RPM_NAME = "python313-changelog-gen-0.1.2-1.2.noarch.rpm"
RPM_HASH = "b7fd36fb3ba2c6ebb16596b212e5828c7e83f73b6fe86be0fbc1f805b7dac8c7b867b76b20f51b59e8a399b559e1cc5fb5c8e57b29356657f2d7541616005c3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-changelog-gen \
python3.13dist-changelog-ai \
python313-changelog-gen \
python3dist-changelog-ai"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-ctranslate2 \
python313-numpy \
python313-requests \
python313-tokenizers \
update-alternatives"

inherit rpm
