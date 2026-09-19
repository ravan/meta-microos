SUMMARY = "Character Tables and Tokenizer for Mathics and the Wolfram Language"
DESCRIPTION = "Character Tables and Tokenizer for Mathics and the Wolfram Language."
LICENSE = "GPL-3.0-only"

PV = "10.0.0"

RPM_NAME = "python313-Mathics-Scanner-10.0.0-1.2.noarch.rpm"
RPM_HASH = "adfa7ed534064e8b0cd95c46e59ad8c809796848bdc8cd1d8edee92d1a4d4e9b2e4bb8bad96570c0c4001b8eb36b785a053cf417bce385c4e6af456104d3bf69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Mathics-Scanner \
python3-Mathics3-Scanner \
python3.13dist-mathics3-scanner \
python313-Mathics-Scanner \
python313-Mathics3-Scanner \
python3dist-mathics3-scanner"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-PyYAML \
python313-chardet \
python313-click \
update-alternatives"

inherit rpm
