SUMMARY = "Security scanner for AI agent skills"
DESCRIPTION = "SkillSpector is a security scanner for AI agent skills (Claude Code, \
Cursor, and similar). It scans skills for vulnerabilities, malicious \
patterns and security risks before installation. \
 \
It supports Git repositories, URLs, zip archives and local directories, \
runs static pattern checks (YARA rules, supply-chain/OSV lookups) and \
optional LLM-based semantic analysis, and produces terminal, JSON, SARIF \
and Markdown reports with risk scoring."
LICENSE = "Apache-2.0"

PV = "2.11.2"

RPM_NAME = "skillspector-2.11.2-1.1.noarch.rpm"
RPM_HASH = "4c0def3a421f17b74e52e5cbdcb006c250c2f653eb4d3573abdc4a8b5f0e30c50676988cad2ddab00298f83901a06582ebdedb652b0bd9da046a2613c66dec6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-skillspector \
python3dist-skillspector \
skillspector"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python313-PyYAML \
python313-boto3 \
python313-httpx \
python313-langchain-anthropic \
python313-langchain-aws \
python313-langchain-core \
python313-langchain-openai \
python313-langgraph \
python313-langsmith \
python313-openai \
python313-packaging \
python313-pydantic \
python313-pywhatwgurl \
python313-regex \
python313-rich \
python313-typer \
python313-yara"

inherit rpm
