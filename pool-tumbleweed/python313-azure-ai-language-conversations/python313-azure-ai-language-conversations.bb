SUMMARY = "Microsoft Azure Conversational Language Understanding Client Library for Python"
DESCRIPTION = "Conversational Language Understanding, aka CLU for short, is a cloud-based conversational \
AI service which is mainly used in bots to extract useful information from user utterance \
(natural language processing). The CLU analyze api encompasses two projects; conversation, \
and orchestration projects. You can use the 'conversation' project if you want to extract \
intents (intention behind a user utterance) and custom entities. You can also use the \
'orchestration' project which orchestrates multiple language apps to get the best response \
(language apps like Question Answering, Luis, and Conversation)."
LICENSE = "MIT"

PV = "1.1.0.0"

RPM_NAME = "python313-azure-ai-language-conversations-1.1.0.0-1.9.noarch.rpm"
RPM_HASH = "5ba89198a6b72b6a024a263993f79dafbca09a18aadae3e7027f064cf58c9514e46d8e7161670507d100c58752b777c177f89bd544cf5a6936a26c0352921c04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-language-conversations \
python3.13dist-azure-ai-language-conversations \
python313-azure-ai-language-conversations \
python3dist-azure-ai-language-conversations"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-core >= 1.24.0 with python313-azure-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-ai-language-nspkg \
python313-azure-ai-nspkg \
python313-six"

inherit rpm
