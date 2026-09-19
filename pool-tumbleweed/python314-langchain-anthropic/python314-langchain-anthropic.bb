SUMMARY = "Integration package connecting Claude (Anthropic) APIs and LangChain"
DESCRIPTION = "langchain-anthropic is the integration package that connects the Claude \
(Anthropic) chat and language model APIs with the LangChain framework, \
exposing the ChatAnthropic and AnthropicLLM classes and related middleware."
LICENSE = "MIT"

PV = "1.7.2"

RPM_NAME = "python314-langchain-anthropic-1.7.2-1.1.noarch.rpm"
RPM_HASH = "0e979f8916c68aa8f60a07ffc3b0bae73b1f653c78c8dd88c213bd26a95c01675d7018888e247094cd0f754406731d65d4a802a4631736874f52f5c050b00b12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-langchain-anthropic \
python314-langchain-anthropic \
python3dist-langchain-anthropic"

RDEPENDS:${PN} += "python-abi \
python314-anthropic \
python314-langchain-core \
python314-pydantic"

inherit rpm
