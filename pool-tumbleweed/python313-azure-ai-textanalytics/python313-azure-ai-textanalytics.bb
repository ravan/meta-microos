SUMMARY = "Azure Text Analytics client library for Python"
DESCRIPTION = "Text Analytics is a cloud-based service that provides advanced natural language \
processing over raw text, and includes six main functions: \
 \
* Sentiment Analysis \
* Named Entity Recognition \
* Personally Identifiable Information (PII) Entity Recognition \
* Linked Entity Recognition \
* Language Detection \
* Key Phrase Extraction"
LICENSE = "MIT"

PV = "5.4.0"

RPM_NAME = "python313-azure-ai-textanalytics-5.4.0-1.2.noarch.rpm"
RPM_HASH = "a5fe397d61985e94ab1354666b2765a46872e79f16f77e3741f7db59a13bd723a0699951be89da14c43d93099610aedb5edc6426082a19aa877203e58b7b261a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-textanalytics \
python3.13dist-azure-ai-textanalytics \
python313-azure-ai-textanalytics \
python3dist-azure-ai-textanalytics"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-core >= 1.27.0 with python313-azure-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-ai-nspkg \
python313-typing-extensions"

inherit rpm
