SUMMARY = "Microsoft Azure Question Answering Client Library for Python"
DESCRIPTION = "Question Answering is a cloud-based API service that lets you create a conversational \
question-and-answer layer over your existing data. Use it to build a knowledge base \
by extracting questions and answers from your semi-structured content, including FAQ, \
manuals, and documents. Answer users’ questions with the best answers from the QnAs \
in your knowledge base—automatically. Your knowledge base gets smarter, too, as it \
continually learns from users' behavior."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python313-azure-ai-language-questionanswering-1.1.0-2.9.noarch.rpm"
RPM_HASH = "91dac819a6db71955175a7ff8bb5be8845090ea1a8203a7bc355c66d5c37c74f6c8e9bf40d83a5500da8822e7374ac1e921297723b02e868ed1d3cd5c8bc1b77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-language-questionanswering \
python3.13dist-azure-ai-language-questionanswering \
python313-azure-ai-language-questionanswering \
python3dist-azure-ai-language-questionanswering"

RDEPENDS:${PN} += "-python313-azure-core >= 1.24.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-ai-language-nspkg \
python313-azure-ai-nspkg \
python313-isodate"

inherit rpm
