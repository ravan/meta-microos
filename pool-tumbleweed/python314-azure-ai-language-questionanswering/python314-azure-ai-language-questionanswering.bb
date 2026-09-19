SUMMARY = "Microsoft Azure Question Answering Client Library for Python"
DESCRIPTION = "Question Answering is a cloud-based API service that lets you create a conversational \
question-and-answer layer over your existing data. Use it to build a knowledge base \
by extracting questions and answers from your semi-structured content, including FAQ, \
manuals, and documents. Answer users’ questions with the best answers from the QnAs \
in your knowledge base—automatically. Your knowledge base gets smarter, too, as it \
continually learns from users' behavior."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python314-azure-ai-language-questionanswering-1.1.0-2.9.noarch.rpm"
RPM_HASH = "8a2080f23193fb98e639a1bf522ec73c0de9c1aaa72fca269e51cfb08d00be0be8501dd101d58afa339eec3063042ebdc7a58c08df53b5dcf06cf8a6f5042ba3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-ai-language-questionanswering \
python314-azure-ai-language-questionanswering \
python3dist-azure-ai-language-questionanswering"

RDEPENDS:${PN} += "-python314-azure-core >= 1.24.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-ai-language-nspkg \
python314-azure-ai-nspkg \
python314-isodate"

inherit rpm
