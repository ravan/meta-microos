SUMMARY = "AI-powered changelog generation from code changes"
DESCRIPTION = "An AI-powered changelog generator that uses fine-tuned T5 models to create \
human-readable changelog entries from code changes. It integrates with both \
OSC (Open Build Service) and Git repositories, providing automated changelog \
generation for software development workflows."
LICENSE = "Apache-2.0"

PV = "0.1.2"

RPM_NAME = "python314-changelog-gen-0.1.2-1.2.noarch.rpm"
RPM_HASH = "c48b88d4d9d60fa4af54056f361742a79b611073162ec4fb458ae0dd6b155960a3a8234839424572f22bd80c10f8482b587d35fcf711824175137e2dcce71fee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-changelog-ai \
python314-changelog-gen \
python3dist-changelog-ai"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-ctranslate2 \
python314-numpy \
python314-requests \
python314-tokenizers \
update-alternatives"

inherit rpm
