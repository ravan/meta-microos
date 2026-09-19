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

RPM_NAME = "python314-azure-ai-translation-text-1.0.1-1.9.noarch.rpm"
RPM_HASH = "d932bca72b4031c81b0fa41b298257eda55fcd7cb9e39667806c34cb304a9d48366ed715bb511ea5a6ecd9bc2cf41e6fbff7f8ef2b23fb7f8acebae77a97cc0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-ai-translation-text \
python314-azure-ai-translation-text \
python3dist-azure-ai-translation-text"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-core >= 1.30.0 with python314-azure-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-ai-nspkg \
python314-azure-ai-translation-nspkg"

inherit rpm
