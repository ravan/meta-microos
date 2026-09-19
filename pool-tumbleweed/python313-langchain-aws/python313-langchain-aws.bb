SUMMARY = "LangChain integrations for AWS"
DESCRIPTION = "This package contains the LangChain integrations with AWS, connecting \
LangChain to AWS services such as Amazon Bedrock, SageMaker, Neptune and \
Kendra."
LICENSE = "MIT"

PV = "1.7.6"

RPM_NAME = "python313-langchain-aws-1.7.6-1.1.noarch.rpm"
RPM_HASH = "8637fd8203a121e17f16e884a7a651f0852746ab02992d85417eaeecc8b43340b0bc1bd881d35a43317c8ae576a57c8359545dfe7a3c0ece62289ec26d675b05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-langchain-aws \
python3.13dist-langchain-aws \
python313-langchain-aws \
python3dist-langchain-aws"

RDEPENDS:${PN} += "python-abi \
python313-boto3 \
python313-langchain-core \
python313-numpy \
python313-pydantic"

inherit rpm
