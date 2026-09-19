SUMMARY = "Interface for developers to integrate Google's LLMs"
DESCRIPTION = "Google Gen AI Python SDK provides an interface for developers to integrate \
Google's generative models into their Python applications. It supports the \
Gemini Developer API and Gemini Enterprise Agent Platform APIs."
LICENSE = "Apache-2.0"

PV = "1.72.0"

RPM_NAME = "python313-google-genai-1.72.0-1.2.noarch.rpm"
RPM_HASH = "b0e7e25f28a632d1b0352f6d0f710ce4a09edd32c1d83f8909ac00a53c8fb25bcfd3358d3b4284c0c7c39c91d7fc0b897ec258eb7eac2f2d8d0e0ecae86759db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-genai \
python3.13dist-google-genai \
python313-google-genai \
python3dist-google-genai"

RDEPENDS:${PN} += "python-abi \
python313-anyio \
python313-distro \
python313-google-auth \
python313-httpx \
python313-pydantic \
python313-requests \
python313-sniffio \
python313-tenacity \
python313-typing-extensions \
python313-websockets"

inherit rpm
