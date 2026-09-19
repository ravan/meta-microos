SUMMARY = "Integration package connecting Claude (Anthropic) APIs and LangChain"
DESCRIPTION = "langchain-anthropic is the integration package that connects the Claude \
(Anthropic) chat and language model APIs with the LangChain framework, \
exposing the ChatAnthropic and AnthropicLLM classes and related middleware."
LICENSE = "MIT"

PV = "1.7.2"

RPM_NAME = "python313-langchain-anthropic-1.7.2-1.1.noarch.rpm"
RPM_HASH = "eaf6a7c67446a7b55b7ff4bedcb62798ef3dbbc9f6ec5bb22b40c6393c403a4a5fc4a312982909ff9ed7bd9ff757c1d2b87b5885519071b22adfb71747065eeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-langchain-anthropic \
python3.13dist-langchain-anthropic \
python313-langchain-anthropic \
python3dist-langchain-anthropic"

RDEPENDS:${PN} += "python-abi \
python313-anthropic \
python313-langchain-core \
python313-pydantic"

inherit rpm
