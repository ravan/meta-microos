SUMMARY = "LangChain integrations for AWS"
DESCRIPTION = "This package contains the LangChain integrations with AWS, connecting \
LangChain to AWS services such as Amazon Bedrock, SageMaker, Neptune and \
Kendra."
LICENSE = "MIT"

PV = "1.7.6"

RPM_NAME = "python314-langchain-aws-1.7.6-1.1.noarch.rpm"
RPM_HASH = "b189e9842d661953081d49a79a65a9d0992422a2ba247782ede38de6602a8b82f5a0546df7785b0a8f4bc2b2269487328c44867699f09788905f5e2cead15744"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-langchain-aws \
python314-langchain-aws \
python3dist-langchain-aws"

RDEPENDS:${PN} += "python-abi \
python314-boto3 \
python314-langchain-core \
python314-numpy \
python314-pydantic"

inherit rpm
