SUMMARY = "Interface for developers to integrate Google's LLMs"
DESCRIPTION = "Google Gen AI Python SDK provides an interface for developers to integrate \
Google's generative models into their Python applications. It supports the \
Gemini Developer API and Gemini Enterprise Agent Platform APIs."
LICENSE = "Apache-2.0"

PV = "1.72.0"

RPM_NAME = "python314-google-genai-1.72.0-1.2.noarch.rpm"
RPM_HASH = "925cdd617c1462f452ae8c89f52544901f6a4de7dcd9eb660b014dee47bec7bf04a6ac83266e07100dfba1be5357202cc16c3d34cf8d89e542e199f2c56cb052"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-genai \
python314-google-genai \
python3dist-google-genai"

RDEPENDS:${PN} += "python-abi \
python314-anyio \
python314-distro \
python314-google-auth \
python314-httpx \
python314-pydantic \
python314-requests \
python314-sniffio \
python314-tenacity \
python314-typing-extensions \
python314-websockets"

inherit rpm
