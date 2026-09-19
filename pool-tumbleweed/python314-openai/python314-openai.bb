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

RPM_NAME = "python314-openai-2.45.0-1.1.noarch.rpm"
RPM_HASH = "1ab170304ef149a602cdaf9e7ec24dd51cd0eb001fe0a2063aaf2c2493aab907b0e2fb3ef835d298c3d49f75edc859f5644112fc75b3c969999e12bfcc71234d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-openai \
python314-openai \
python3dist-openai"

RDEPENDS:${PN} += "python-abi \
python314-anyio \
python314-distro \
python314-httpx \
python314-jiter \
python314-pydantic \
python314-sniffio \
python314-tqdm \
python314-typing-extensions"

inherit rpm
