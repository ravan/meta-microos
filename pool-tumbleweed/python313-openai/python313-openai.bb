SUMMARY = "OpenAI bindings for python"
DESCRIPTION = "The OpenAI Python library provides convenient access to the OpenAI API \
from applications written in the Python language. It includes a \
pre-defined set of classes for API resources that initialize \
themselves dynamically from API responses which makes it compatible \
with a wide range of versions of the OpenAI API. \
 \
You can find usage examples for the OpenAI Python library in \
 https://beta.openai.com/docs/api-reference?lang=python \
 https://github.com/openai/openai-cookbook/."
LICENSE = "Apache-2.0"

PV = "2.45.0"

RPM_NAME = "python313-openai-2.45.0-1.1.noarch.rpm"
RPM_HASH = "92b54ed054c18c0b7d449f8ae5f3afc1a19a313ee966eb66c27660e96375d200ba41d87fe972c64d648bf8eb05f2f3681d1e2f89010fe4c7a6f68eae1e0f9b80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openai \
python3.13dist-openai \
python313-openai \
python3dist-openai"

RDEPENDS:${PN} += "python-abi \
python313-anyio \
python313-distro \
python313-httpx \
python313-jiter \
python313-pydantic \
python313-sniffio \
python313-tqdm \
python313-typing-extensions"

inherit rpm
