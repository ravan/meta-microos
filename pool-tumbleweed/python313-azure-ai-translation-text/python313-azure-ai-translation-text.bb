SUMMARY = "Azure Text Translation Client Library for Python"
DESCRIPTION = "Text Translation is a cloud-based REST API feature of the Translator service that uses \
neural machine translation technology to enable quick and accurate source-to-target \
text translation in real time across all supported languages. \
 \
Use the Text Translation client library for Python to: \
 \
* Return a list of languages supported by Translate, Transliterate, and Dictionary operations. \
* Render single source-language text to multiple target-language texts with a single request. \
* Convert text of a source language in letters of a different script. \
* Return equivalent words for the source term in the target language. \
* Return grammatical structure and context examples for the source term and target term pair."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python313-azure-ai-translation-text-1.0.1-1.9.noarch.rpm"
RPM_HASH = "9f301cc86236d4fc83e389f98a0a72cf391ed4ee9e63f2424cd1f4339b55cd0e3b58e1d5f3e4e56a0ba435b1bfc53d70dba0b68b1929fc789a9f2e3fab1233c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-translation-text \
python3.13dist-azure-ai-translation-text \
python313-azure-ai-translation-text \
python3dist-azure-ai-translation-text"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-core >= 1.30.0 with python313-azure-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-ai-nspkg \
python313-azure-ai-translation-nspkg"

inherit rpm
