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

RPM_NAME = "python314-azure-ai-language-conversations-1.1.0.0-1.9.noarch.rpm"
RPM_HASH = "71c55dc3f2c1fe85cd81571f75925790ebfbf9ea05b19c5d28c6c6c606e0fb11085d6eda89aff312ef8bb493d1d749d3904d0589cbea4d12deb903a089de3dd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-ai-language-conversations \
python314-azure-ai-language-conversations \
python3dist-azure-ai-language-conversations"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-core >= 1.24.0 with python314-azure-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-ai-language-nspkg \
python314-azure-ai-nspkg \
python314-six"

inherit rpm
