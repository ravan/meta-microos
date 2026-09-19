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

RPM_NAME = "python314-azure-ai-textanalytics-5.4.0-1.2.noarch.rpm"
RPM_HASH = "7fc38fb1ad16f2299597e529ac155749234f6c951222a00321a23d5f331d3aaf6f40eda625166a2820c51c961394d3777149311d908ae684df1e4e64c51b8b0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-ai-textanalytics \
python314-azure-ai-textanalytics \
python3dist-azure-ai-textanalytics"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-core >= 1.27.0 with python314-azure-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-ai-nspkg \
python314-typing-extensions"

inherit rpm
