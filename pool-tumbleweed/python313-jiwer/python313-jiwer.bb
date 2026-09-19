SUMMARY = "Evaluate your speech-to-text system with similarity measures"
DESCRIPTION = "JiWER is a simple and fast python package to evaluate an automatic speech recognition system. \
It supports the following measures: \
 \
1. word error rate (WER) \
2. match error rate (MER) \
3. word information lost (WIL) \
4. word information preserved (WIP) \
5. character error rate (CER)"
LICENSE = "Apache-2.0"

PV = "4.0.0"

RPM_NAME = "python313-jiwer-4.0.0-1.5.noarch.rpm"
RPM_HASH = "69e3add68c25e654007d211f52b18983a540f9da9bcb3a10e311f16760afd3df699271e8a5d95f6c5c1a89d4eafba2d1aee984a85cd3141ecf24eead6685dd6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jiwer \
python3.13dist-jiwer \
python313-jiwer \
python3dist-jiwer"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-click \
python313-rapidfuzz \
update-alternatives"

inherit rpm
